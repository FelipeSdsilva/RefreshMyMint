package entities;

public final class Triangle extends Shape {

    private double width;
    private double height;
    private double base;

    private double area;

    public Triangle() {
    }

    public Triangle(double width, double height, double base) {
        this.width = width;
        this.height = height;
        this.base = base;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double measuresOfTriangle() {
        double p = (getWidth() + getHeight() + getBase()) / 2;
        double measure = Math.sqrt(p * ((p - getWidth()) * (p - getHeight()) * (p - getBase())));
        return area = measure;
    }

    public static void theBiggeArea(Triangle a, Triangle b) {
        if (a.getArea() > b.getArea()) {
            System.out.println("Large area: X " + String.format("%.4f", a.getArea()));
        } else {
            System.out.println("Large area: Y " + String.format("%.4f", b.getArea()));
        }
    }

    @Override
    public String toString() {
        return "Triangle [ area=" + String.format("%.4f", getArea()) + "]";
    }

    @Override
    public Double area() {
        return null;
    }

}
