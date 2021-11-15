package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать. Ваша задача угадать число!");
        System.out.println("Введите разброс чисел от нуля до: ");
        int range = scanner.nextInt();
        int number = (int) (Math.random() * range);
        System.out.println("Угадайте число от 0 до " + range);

        while (true) {
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Поздравляю, вы угадали!");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше " + input_number + " Попробуйте ещё раз");
            } else System.out.println("Загаданное число больше " + input_number + " Попробуйте ещё раз");
        }
        scanner.close();
    }
}