package com.company;

import java.util.Scanner;

public class even2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if ((a%2==0 && b%2==0) || (a%2==0 && c%2==0) || (b%2==0 && c%2==0))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
