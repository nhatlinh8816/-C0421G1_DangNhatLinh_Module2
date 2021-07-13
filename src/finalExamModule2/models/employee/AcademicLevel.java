package finalExamModule2.models.employee;

import finalExamModule2.utils.CheckChoice;

public class AcademicLevel {
    public String choiceAcademicLevel() {

        String academicLevel = null;
        boolean check = true;
        while (check) {
            System.out.println("Chọn loại bằng cấp");
            System.out.println("1.Trung cấp");
            System.out.println("2.Cao đẳng");
            System.out.println("3.Đại học");
            System.out.println("4.Sau đại học");
            int choice = new CheckChoice().choice();
            switch (choice) {
                case 1: {
                    academicLevel = "Trung Cấp";
                    check = false;
                    break;
                }
                case 2: {
                    academicLevel = "Cao đẳng";
                    check = false;
                    break;
                }
                case 3: {
                    academicLevel = "Đại học";
                    check = false;
                    break;
                }
                case 4: {
                    academicLevel = "Sau Đại học";
                    check = false;
                    break;
                }
                default:
                   break;
            }
        }
        return academicLevel;
    }
}
