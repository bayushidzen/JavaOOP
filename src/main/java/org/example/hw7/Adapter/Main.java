package org.example.hw7.Adapter;

public class Main {

    // Есть библиотека сбора данных от датчиков. Все они были куплены в комплекте с этой библиотекой.
    // Поступил новый датчик от другой компании, интерфейс которого отличается от предыдущих.
    // Надо включить этот датчик в систему.
    public static void main(String[] args) {
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1);
        meteoDb.save(ms200_1);

        // Здесь надо вызвать метод getData у класса ST500Info. Полученные данные отправить в метод
        // save объекта meteoDb
        ST500Info st500_1 = new ST500Info();
        st500_1.getData();
        MeteoAdapter st500Adapter = new MeteoAdapter(st500_1);
        meteoDb.save(st500Adapter);
    }
}