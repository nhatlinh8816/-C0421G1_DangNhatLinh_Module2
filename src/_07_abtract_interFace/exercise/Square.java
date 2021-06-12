package _07_abtract_interFace.exercise;

public class Square extends Shape implements ResizeAble {
    double edge;
    //constructor;
    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }
    //getter, setter;

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    public double getArea(){
        return this.edge*this.edge;
    }

    @Override
    public String toString() {
        return "A Square with edge="
                + getEdge()
                + " with area="
                +getArea()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double p) {
        this.edge *= (1+(p/100)) ;
    }


}
