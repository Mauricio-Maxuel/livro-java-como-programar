package org.maumas.AGCapitulo8.exercicios.AA8_04;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {

        this.length = 1;
        this.width = 1;

    }

    public double perimeter() {
        return 2 * (width + length);
    }

    public double area() {
        return width * length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (verifyWidthLength(this.width, length)) {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (verifyWidthLength(width, this.length)) {
            this.width = width;
        }
    }


    boolean verifyWidthLength(double width, double length) {
        return (width > 0.0 && width < 20.0) && (length > 0.0 && length < 20.0);
    }
}
