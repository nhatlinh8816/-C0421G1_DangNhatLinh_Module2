package _17_io_binary.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteBinary<E> {
    List<E> e = new ArrayList<>();

    public void writeBinary(String path, List<E> e) throws IOException {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(e);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }finally {
            if (fileOutputStream!=null){
                fileOutputStream.close();
            }
            if (objectOutputStream!=null){
                objectOutputStream.close();
            }
        }
    }
    public List<E> readBinary(String path){
        List<E> e = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            e =(List<E>) objectInputStream.readObject();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }return e;
    }

}
