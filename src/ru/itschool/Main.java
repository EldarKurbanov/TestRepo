package ru.itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = 0;
        while (x < n) {
            int height = sc.nextInt();
            if (height < 437) {
                System.out.println(x + 1);
                break;
            }
            x++;
        }
        if (x == n) {
            System.out.println("No crash");
        }


    }
}
