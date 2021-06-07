package _04_oop_class_object.excercise;

public class Fan {
    private int SLOW = 1;
    private int MEDIUM = 2;
    private int FAST = 3;
    private int speed = 1;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    //getter:
    private int getSpeed() {
        return this.speed;
    }

    private boolean getStatus() {
        return this.status;
    }

    private double getRadius() {
        return this.radius;
    }

    private String getColor() {
        return this.color;
    }

    //setter:
    private int setSpeed() {
       return  this.speed = speed;
    }

    private boolean setStatus() {
        return this.status = status;
    }

    private double setRadius() {
        return this.radius = radius;
    }
    private String setColor() {
        return this.color = color;
    }
    //constructor:
    public Fan(){
    }
    public Fan(int speed,double radius,boolean status,String color){
        this.speed = speed;
        this.radius = radius;
        this.status = status;
        this.color = color;
    }
    public String toString() {
        if (status==true){
            return
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    " fan is on"+ '\'' ;

        } else {
            return
                    "radius=" + radius +
                    ", color='" + color + '\'' +
                    " fan is off"+ '\'' ;
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3,10,true,"yellow");
        Fan fan2 = new Fan(2,5,false,"blue");
        System.out.println("Fan1:");
        System.out.println(fan1.toString());
        System.out.println("Fan2:");
        System.out.println(fan2.toString());
    }
}
//return "speed: "+speed+", radius: "+radius+", status: "+status+", color "+color;