package _17_io_binary.exercise;

import _16_io_Text.exercise.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainTestProduct {
    public static void main(String[] args) throws IOException {
        Product product1 = new Product(1,"TV","Sony",20000);
        Product product2 = new Product(2,"Fan","Sanyo",1000);
        Product product3 = new Product(3,"Laptop","Asus",20000);
        Product product4 = new Product(4,"Air Conditional","Daikin",30000);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        ReadAndWriteBinary readAndWriteBinary = new ReadAndWriteBinary();
        readAndWriteBinary.writeBinary("src\\_17_io_binary\\BinaryProduct.csv",products);
        List<Product> exportProducts = readAndWriteBinary.readBinary("src\\_17_io_binary\\BinaryProduct.csv");
        for (Product element : exportProducts){
            System.out.println(element.toString());
        }
    }
}
