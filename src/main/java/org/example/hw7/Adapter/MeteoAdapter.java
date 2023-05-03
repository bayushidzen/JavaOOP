package org.example.hw7.Adapter;

import java.time.LocalDateTime;

public class MeteoAdapter implements MeteoSensor {
    private ST500Info st500;

    public MeteoAdapter(ST500Info st500) {
        this.st500 = st500;
    }

    @Override
    public int getId() {
        return st500.getData().identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) st500.getData().temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime adaptDate = LocalDateTime.of(st500.getData().year(),1,st500.getData().day(),1,1,st500.getData().second());
        return null;
    }
}
