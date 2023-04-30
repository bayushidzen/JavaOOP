package org.example.hw6.Warehouse13;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Client {
    Integer id;
    String name;
    String address;
    Integer telephone;
    String email;

}
