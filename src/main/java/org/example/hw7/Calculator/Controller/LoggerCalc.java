package org.example.hw7.Calculator.Controller;

import java.io.*;
import java.time.LocalDateTime;

public class LoggerCalc implements Loggable {
    private File logPath = new File("/Volumes/KingSSD/GB/GB_Java_OOP/sem2/javaoop/src/main/java/org/example/hw7/Calculator/log.log");
    private LocalDateTime dateTimeStamp = LocalDateTime.now();
    @Override
    public void saveLog(String str) throws IOException {
        FileWriter writer = new FileWriter("/Volumes/KingSSD/GB/GB_Java_OOP/sem2/javaoop/src/main/java/org/example/hw7/Calculator/log.log", true);
        writer.append(dateTimeStamp.toString());
        writer.write(str);
        writer.append("\n");
        System.out.println("Лог записан");
        writer.close();
    }

    @Override
    public void openFile(){
        if(!this.logPath.exists()){
            createFile();
        }
        else {
            System.out.println("Файл для логов существует");
        }
    }

    @Override
    public void createFile() {
        File logFile = new File("/Volumes/KingSSD/GB/GB_Java_OOP/sem2/javaoop/src/main/java/org/example/hw7/Calculator/log.log");
    }

    @Override
    public void printFile() throws IOException {
        FileReader reader = new FileReader(logPath);
        int c;
        while((c=reader.read())!=-1){

            System.out.print((char)c);
        }
        System.out.println();
    }

}
