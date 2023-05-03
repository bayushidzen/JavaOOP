package org.example.hw7.Calculator.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RatNumber<T extends Number> {
    protected T rational;

    public RatNumber(T rational) {
        this.rational = rational;
    }

    public T getRational() {
        return rational;
    }
}
