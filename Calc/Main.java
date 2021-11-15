package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* System.out.println("Введите операцию");
        System.out.println("1. Сложение");
        System.out.println("2. Вычетание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление"); */

        //region Scanner and val
        Scanner scanner = new Scanner(System.in);
        //int operation = scanner.nextInt();
        System.out.println("Введите первое число: ");
        int fnum = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int snum = scanner.nextInt();
        int result = 0;
        //endregion

        System.out.println("Введите операцию");
        System.out.println("1. Сложение");
        System.out.println("2. Вычетание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        /* if(operation == 1){
            result = fnum + snum;
        } else if(operation == 2){
            result = fnum - snum;
        } else if(operation == 3){
            result = fnum * snum;
        } else if(operation == 4){
            result = fnum * snum;
        } else
            System.out.println("Вы ввели недопустимое значение операции, задайте его заного");
        operation = scanner.nextInt();
        if(operation == 1){
            result = fnum + snum;
        } else if(operation == 2){
            result = fnum - snum;
        } else if(operation == 3){
            result = fnum * snum;
        } else */

            while (true) {
                int operation = scanner.nextInt();
                if(operation == 1){
                    result = fnum + snum;
                    break;
                } else if(operation == 2){
                    result = fnum - snum;
                    break;
                } else if(operation == 3){
                    result = fnum * snum;
                    break;
                } else if(operation == 4){
                    result = fnum * snum;
                    break;
                } else System.out.println("Вы ввели недопустимое значение операции, задайте его заного");

            }
        scanner.close();


        System.out.println("Результат: " + result);
    }
}

    /* ДЗ
    1. Дописать калькулятор, что бы он мог выполнять деление ?
    2. Что бы калькулятор при введении значения переменной "operation", отличного от заданных в уловие,
    выдавал в консоль сообщение об ошибке и предлагал заного ввести значение ?
     */