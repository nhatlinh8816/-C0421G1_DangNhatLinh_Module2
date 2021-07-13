package finalExamModule2.models.employee;

import finalExamModule2.utils.CheckChoice;

public class Gender {
    public String gender() {
        String a = null;
        boolean check = true;
        while (check) {
            System.out.println("Chọn giới tính");
            System.out.println("1.Nam");
            System.out.println("1.Nữ");
            int choice = new CheckChoice().choice();
            switch (choice) {
                case 1: {
                    a = " male";
                    check = false;
                    break;
                }
                case 2: {
                    a = "female";
                    check = false;
                    break;
                }
                default: break;
            }
        }
        return a;
    }
}
