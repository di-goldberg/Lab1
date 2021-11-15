package com.company;
import java.util.Scanner;
public class lab1 {

    public static void main(String[] args) {
        System.out.print("Введите первое целое число: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = scan.nextInt();
        System.out.print("Введите третье целое число: ");
        int c = scan.nextInt();
        System.out.print("Введите четвертое целое число: ");
        int d = scan.nextInt();
        int x = 0;
        if (a<b & a<c & a<d) x = a;

        else if (b<a & b<c & b<d) x = b;
        else if (c<a & c<b & c<d) x = c;
        else if (d<b & d<c & d<a) x = d;
        else if ((a == b) & (c == d)) x = a;
        else if (a == b)  x = a;
        else if (c == d)  x = c;
        else if (a == c)  x = a;
        else if (c == b)  x = c;
        else if (a == d)  x = a;
        else if (d == b)  x = a;

        System.out.println("Наименьшее число = " + x);

    }
}
