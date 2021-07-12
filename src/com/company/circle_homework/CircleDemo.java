package com.company.circle_homework;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a radius: ");

        Circle circle = new Circle(scanner.nextInt());

        System.out.println(circle.area());
        System.out.println(circle.circumference());
    }
}
