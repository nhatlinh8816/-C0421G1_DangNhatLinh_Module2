package _case_Study.models;

public class Employee extends Person {
    private int idEmployee;
    private String level;
    private String position;
    float salary;

    public Employee(String name, String dateOfBith, String gender, String identityNumber, String phoneNumber, String email, int idEmployee, String level, String position, float salary) {
        super(name, dateOfBith, gender, identityNumber, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int idEmployee, String level, String position, float salary) {
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+
                "idEmployee=" + idEmployee +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

