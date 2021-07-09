package com.company;

public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Rectangle rectangle1 = new Rectangle();

        rectangle1.setBreadth(12);
        rectangle1.setLength(7);

        System.out.println("Area:" + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("Area1:" + rectangle1.getArea());
        System.out.println("Perimeter1: " + rectangle1.getPerimeter());
    }
}
