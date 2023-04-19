package org.example.hw3.BullsCows;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
//    private Integer usersTries;
    private String userInput;
    private Integer cows;
    private Integer bulls;
}
