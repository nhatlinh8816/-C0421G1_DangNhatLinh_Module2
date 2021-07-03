package _case_Study.utils;

import _case_Study.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeFile(String pathFile, Employee line){
        try {
            FileWriter fileWriter = new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(String.valueOf(line));
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static <E> List<E> readFile (String pathFile){
        List<E> listLine = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line=bufferedReader.readLine())!=null){     //đọc line cho đến khi nào hết line cuối thì thôi
            listLine.add((E) line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }return listLine;
    }
}
