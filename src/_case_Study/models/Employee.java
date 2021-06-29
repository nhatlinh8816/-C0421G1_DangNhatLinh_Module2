package _case_Study.models;

public class Employee extends Person {
    int idEmployee;
    String level;
    String position;
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
}

