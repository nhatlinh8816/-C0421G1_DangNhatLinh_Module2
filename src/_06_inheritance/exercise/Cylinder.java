package _06_inheritance.exercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return height * radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + this.height +
                " volume=" + this.getVolume() +
                " with base class is " + super.toString() +
                '}';
    }

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(10,"blue",25);
        System.out.println(cylinder1);
    }

}
