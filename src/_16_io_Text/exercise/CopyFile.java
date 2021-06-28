package _16_io_Text.exercise;

import java.util.List;

public class CopyFile {
    public static final String SOUCRCE_FILE = "src/_16_io_Text/source.txt";
    public static final String TARGET_FILE = "src/_16_io_Text/target.txt";
    public static void main(String[] args) {
        //đọc file từ file nguồn;
        List<String> numbers = ReadAndWriteFile.readFile(SOUCRCE_FILE);
        System.out.println(numbers);
        System.out.println(numbers.size());
        //copy dữ liệu sang file đích và hiển thị số ký tự trong tệp:
        String line = null;
        for (String element: numbers){
            line = element;
            ReadAndWriteFile.writeFile(TARGET_FILE,line);
        }
        String line1 = CopyFile.numberOfElement(numbers);
        ReadAndWriteFile.writeFile(TARGET_FILE,line1);

    }
    public static String numberOfElement(List<String> numbers){
        return "Số phần tử là "+numbers.size();
    }





}
