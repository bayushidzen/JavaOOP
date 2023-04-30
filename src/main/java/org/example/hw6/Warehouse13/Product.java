package org.example.hw6.Warehouse13;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product extends Nomenclature {
    Integer amount;
    Integer price;

    public void increaseQuantity(Integer amount){
        this.amount += amount;
    }
    public void decreaseQuantity(Integer amount){
        this.amount -= amount;
    }

}
