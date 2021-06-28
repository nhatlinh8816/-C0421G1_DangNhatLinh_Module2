package _16_io_Text.practice;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {


    public void ReadFileText(String duongDan) {
        try {
            //Đọc file;
            File file = new File(duongDan);
            //Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ:
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            //đọc file:
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = ""; //khởi tạo line để đọc dữ liệu;
            int sum = 0; //khởi tạo sum bằng tổng các phần tử;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tổng các số là " + sum);
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file");
        Scanner input = new Scanner(System.in);
        String duongDan = input.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.ReadFileText(duongDan);
    }
}
