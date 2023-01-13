package entities;

import entities.enums.Color;

public final class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle() {
    }

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(Color color, Double height, Double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public final Double area() {
        return height * width;
    }

    public double perimeter() {
        return (height + width) * 2;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
    }

    @Override
    public String toString() {
        return "Retangle [Area = " +
                String.format("%.2f", area()) +
                ", perimeter = " +
                String.format("%.2f", perimeter()) +
                ", diagonal = " +
                String.format("%.2f", diagonal()) + "]";
    }


}
