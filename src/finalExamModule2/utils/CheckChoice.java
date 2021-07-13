package finalExamModule2.utils;

public class CheckChoice {
    public Integer choice(){
        int choice = 0;
        try {
            choice = Integer.parseInt(new CheckSpace().inputString());
        } catch (NumberFormatException ex) {
            System.out.println("Giá trị phải là số, vui lòng nhập lại");
        }
        return choice;
    }
}
