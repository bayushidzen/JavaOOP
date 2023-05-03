package org.example.hw7.Calculator.Controller;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Loggable {
    void saveLog(String str) throws IOException;
    void openFile() throws IOException;
    void createFile();
    void printFile() throws IOException;
}
