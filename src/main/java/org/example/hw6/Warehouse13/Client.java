package org.example.hw6.Warehouse13;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Client {
    private Integer id;
    private String name;
    private String address;
    private Integer telephone;
    private String email;

}
