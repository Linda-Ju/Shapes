package com.company.circle_homework;

public class Circle {
    int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float area() {
        return (float) (Math.PI * (this.radius * this.radius));
    }

    public float circumference() {
        return (float) (Math.PI * 2 * this.radius);
    }
}
