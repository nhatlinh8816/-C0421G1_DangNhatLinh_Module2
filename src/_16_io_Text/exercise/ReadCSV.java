package _16_io_Text.exercise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV  {

    private static final String FILE_PATH = "src\\_16_io_Text\\nation.csv";
    private static final String HEADER_NATION = "id,code,name";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String COMMA_DELIMITER = ",";
    public static void main(String[] args) {
            Nation nation1 = new Nation(1,"AU","Australia");
            Nation nation2 = new Nation(2,"CN","China");
            Nation nation3 = new Nation(3,"AU","Australia");
            Nation nation4 = new Nation(4,"CN","China");
            Nation nation5 = new Nation(5,"JP","Japan");
            Nation nation6 = new Nation(6,"CN","China");
            Nation nation7 = new Nation(7,"JP","Japan");
            Nation nation8 = new Nation(8,"TH","Thailand");
            List<Nation> nationList = new ArrayList<>();
            nationList.add(nation1);
            nationList.add(nation2);
            nationList.add(nation3);
            nationList.add(nation4);
            nationList.add(nation5);
            nationList.add(nation6);
            nationList.add(nation7);
            nationList.add(nation8);
        File file = new File(FILE_PATH);
        if (!file.exists() ){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.append(HEADER_NATION);
            for (Nation nation: nationList){
                fileWriter.append(NEW_LINE_SEPARATOR);
                fileWriter.append(String.valueOf(nation.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(nation.getCode());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(nation.getName());
            }
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        //đọc file;
        List<String>listLine = ReadAndWriteFile.readFile(FILE_PATH);
        System.out.println(listLine);
    }
}
