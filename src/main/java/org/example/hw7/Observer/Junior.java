package org.example.hw7.Observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Junior implements Observer {
    String name;

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        System.out.println("Доступен новый оффер от компании " + nameCompany + "с зарплатой" + salary);
    }
}
