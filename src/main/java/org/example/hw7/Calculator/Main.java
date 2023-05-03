package org.example.hw7.Calculator;

import org.example.hw7.Calculator.Controller.LoggerCalc;
import org.example.hw7.Calculator.Controller.RatNumControl;
import org.example.hw7.Calculator.Model.RatNumber;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        LoggerCalc newLog = new LoggerCalc();
        newLog.saveLog(" Новый запуск калькулятора ");

        menu();
        newLog.openFile();

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Выберите действие: ");
            int choose = scanner.nextInt();
            RatNumControl ratNum = new RatNumControl();

            switch (choose) {
                case 1:
                    RatNumber sum1 = enterData("первое");
                    RatNumber sum2 = enterData("второе");
                    System.out.println("Сумма чисел равна: " + ratNum.summa(sum1, sum2).getRational());
                    newLog.saveLog(" Сумма чисел " + sum1 +" и " + sum2 + " равна: " + ratNum.summa(sum1, sum2).getRational());
                    break;
                case 2:
                    RatNumber sub1 = enterData("первое");
                    RatNumber sub2 = enterData("второе");
                    System.out.println("Разность чисел равна: " + ratNum.subtraction(sub1, sub2).getRational());
                    newLog.saveLog(" Разность чисел " + sub1 +" и " + sub2 + " равна: " + ratNum.subtraction(sub1, sub2).getRational());
                    break;
                case 3:
                    RatNumber mul1 = enterData("первое");
                    RatNumber mul2 = enterData("второе");
                    System.out.println("Произведение чисел равно: " + ratNum.multiply(mul1, mul2).getRational());
                    newLog.saveLog(" Произведение чисел " + mul1 +" и " + mul2 + " равно: " + ratNum.multiply(mul1, mul2).getRational());
                    break;
                case 4:
                    RatNumber div1 = enterData("первое");
                    RatNumber div2 = enterData("второе");
                    System.out.println("Частное чисел равно: " + ratNum.division(div1, div2).getRational());
                    newLog.saveLog(" Частное чисел " + div1 +" и " + div2 + " равно: " + ratNum.subtraction(div1, div2).getRational());
                    break;
                case 0:
                    System.out.println("Благодарим вас за использование нашего калькулятора, ждём вас снова!");
                    newLog.saveLog(" Пользователь завершил работу с калькулятором\n");
                    break;
                default:
                    System.out.println("Данный функционал в разработке");
                    newLog.saveLog(" Пользователь выбрал неверный пункт меню\n");
                    menu();
            }
            System.out.println("\n============================\n");
            System.out.print("Хотите ли продолжить работу?\n" +
                    " 1 - Да " + "2 - Нет\n"
            + "Продолжаем: ");
            int restart = scanner.nextInt();
            if (restart == 1) {
                newLog.saveLog(" Пользователь продолжил использовать калькулятор ");
                menu();
            } else {
                break;
            }
        }
    }
    public static void menu() {
        System.out.flush();
        System.out.println("--------------------Кулькулятор 3000--------------------\n" +
                "1 - Сложение\n" +
                "2 - Вычитание\n" +
                "3 - Умножение\n" +
                "4 - Деление\n" +
                "0 - Закрыть калькулятор\n" +
                "-------------------------------------------------");
    }
    public static RatNumber enterData(String number) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите " + number + " число: ");
        RatNumber data = new RatNumber<>(scanner.nextInt());
        return data;
    }
}
