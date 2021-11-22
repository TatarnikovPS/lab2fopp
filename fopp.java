package com.metanit;
import java.util.Scanner;
/*Task:
*Пользователь вводит с клавиатуры целое
неотрицательное число n (n<15). С помощью
циклов for и while посчитать факториал n! и вывести на
экран.
 */
public class fopp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int summa=1;
        System.out.print("Введите целое неотрицательное число n (n<15): ");
        while (!in.hasNextInt()) {
            System.out.println("Ошибка при вводе!");
            System.out.println("Введите целое неотрицательное число n (n<15): ");
            in.next();
        }
        n = in.nextInt();
        if (n < 0 | n > 14) {
            System.out.println("Введёное число не соответствует условиям!");
        }
        else {
            for(int i=1;i<n;i++) {
                summa *=(i+1);
            }
         System.out.println("Факториал: " + summa);
        }
    }
}
