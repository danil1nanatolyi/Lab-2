package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Input a number");
        double a = in.nextDouble();
        double argone=Math.pow(Math.cos((3*Math.PI)/8-a/4),2);
        double argtwo=Math.pow(Math.cos((3*Math.PI)/11+a/4),2);
        double argthree=argone/argtwo;
        double z1=argone/argtwo;
        System.out.println(z1);
        in.close();
    }
}
