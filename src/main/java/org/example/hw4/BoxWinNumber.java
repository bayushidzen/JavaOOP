package org.example.hw4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoxWinNumber <T extends Number>{
    private T[] arr;

    public double average(){
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i].doubleValue();
        }
        return result /= arr.length;
    }

    public boolean compare(BoxWinNumber<?> boxi1) {
        return Math.abs(average()- boxi1.average()) < 0.00001;
    }
}
