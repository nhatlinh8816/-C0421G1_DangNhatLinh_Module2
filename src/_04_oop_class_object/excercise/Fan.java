package _04_oop_class_object.excercise;

public class Fan {
    public static final int SLOW = 1;   // khởi tạo hằng để hiển thị tốc độ quạt
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
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
    private int setSpeed(int speed) {
       return  this.speed = speed;
    }

    private boolean setStatus(boolean status) {
        return this.status = status;
    }

    private double setRadius(double radius) {
        return this.radius = radius;
    }
    private String setColor(String color) {
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
    public String speed(){
        if (this.speed==1){
            return "LOW";
        }else if (this.speed==2){
            return "MEDIUM";
        }else if (this.speed==3){
            return "FAST";
        } else {
            return "No speed";
        }
    }
    public String toString() {
        if (status==true){
            return
                    "speed=" + speed() +
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
        Fan fan1 = new Fan(1,10,true,"yellow");
        Fan fan2 = new Fan(2,5,false,"blue");
        System.out.println("Fan1:"+fan1.toString());
        System.out.println("Fan2:"+fan2.toString());
        System.out.println(fan1.getStatus());
        fan1.setRadius(15);
        fan1.setSpeed(3);
        fan1.setColor("Purple");
        fan1.setStatus(false);
        System.out.println("Fan1:"+fan1.toString());
    }
}
//return "speed: "+speed+", radius: "+radius+", status: "+status+", color "+color;