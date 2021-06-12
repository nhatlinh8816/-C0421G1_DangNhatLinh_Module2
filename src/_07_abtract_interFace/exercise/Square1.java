package _07_abtract_interFace.exercise;

public class Square1 extends Shape implements Colorable {
    double egde;
    //contructor
    public Square1(double egde) {
        this.egde = egde;
    }
    public Square1(String color, boolean filled, double egde) {
        super(color, filled);
        this.egde = egde;
    }
    // getter, setter;

    public double getEgde1() {
        return egde;
    }

    public void setEgde1(double egde) {
        this.egde = egde;
        // method
    }
    public double getArea1(){
        return this.egde*this.egde;
    }
    //Override;
    @Override
    public void resize(double p) {
        this.egde*=(1+(p/100)) ;
    }

    @Override
    public String toString() {
        return "A Square with edge="
                + getEgde1()
                + " with area="
                + getArea1()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
