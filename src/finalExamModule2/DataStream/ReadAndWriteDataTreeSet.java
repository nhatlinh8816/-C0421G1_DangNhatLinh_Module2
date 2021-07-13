package finalExamModule2.DataStream;

import finalExamModule2.models.bookingAndContract.Booking;
import finalExamModule2.utils.BookingComparatorDate;


import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class ReadAndWriteDataTreeSet {


    public Set<Booking> readDataFileTreeSet(String path) {
        Set<Booking> bookings = new TreeSet<>(new BookingComparatorDate());
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            bookings = (Set<Booking>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (ClassNotFoundException | IOException e) {
            System.out.println(e.getMessage());
        }
        return bookings;
    }


    public void writeDataFileTreeSet(Set<Booking> bookings, String path) {
        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(bookings);
            objectOutputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void clearData(String path) {
        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(null);
            objectOutputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
