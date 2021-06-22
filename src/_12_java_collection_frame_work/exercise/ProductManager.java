package _12_java_collection_frame_work.exercise;

import _03_array.practice.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product>productList = new ArrayList<Product>();
    private static Scanner input = new Scanner(System.in);
    private static String inputOutput(String message){
        System.out.println(message);
        String output = input.nextLine();
        return output;
    }
    public static void main(String[] args) {
        ProductManager product = new ProductManager();
        Scanner input = new Scanner(System.in);
        System.out.println("----Manager Product----");
        int choice;
        do {
            System.out.println("----Chọn chức năng----");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Xem sản phẩm");
            System.out.println("3.Sửa sản phẩm");
            System.out.println("4.Xóa sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm");
            System.out.println("6.Sắp xếp sản phẩm theo giá từ thấp đến cao");
            System.out.println("7.Thoát chương trình");
            choice= Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    product.addProduct();
                    break;
                case 2:
                    product.displayProduct();
                    break;
                case 3:
                    product.editProduct();
                    break;
                case 4:
                    product.deleteProduct();
                    break;
                case 5:
                    product.searchProduct();
                    break;
                case 6:
                    product.sortProduct();
                    break;
                case 7:
                    System.exit(7);
                    break;
            }
        }while (choice!=7);
    }

    public void addProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input id for new product");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Input name for new product");
        String name  = input.nextLine();
        System.out.println("Input price for new product");
        float price = input.nextFloat();
        Product newProduct = new Product(id,name,price);
        productList.add(newProduct);
    }
    public void displayProduct(){
        if (productList.size()==0){
            System.out.println("No products");
        } else {
            for (Product products: productList){
                products.display();
            }
        }
    }
    public void searchProduct(){
        if (productList.size()==0){
            System.out.println("No products");
        } else {
            System.out.println("Input name for product");
            String searchName = input.nextLine();
            boolean check = false;
            for (Product products: productList){
                if (!searchName.equals(products.name)){
                    check = false;
                }else {
                    check = true;
                    products.display();
                    break;
                }
            }
        }
    }
    public void deleteProduct(){
        if (productList.size()==0){
            System.out.println("No products");
        } else {
            System.out.println("Input id for product");
            int searchId = input.nextInt();
            boolean check = false;
            for (Product products: productList){
                if (searchId!=products.id){
                    System.out.println("No product found");
                }else {
                    productList.remove(products);
                    break;
                }
            }
        }
    }
    public void editProduct(){
        if (productList.size()==0){
            System.out.println("No products");
        } else {
            System.out.println("Input id for product");
            int searchId = Integer.parseInt(input.nextLine());
            boolean check = true;
            for (Product products: productList){
                if (searchId!=products.id){
                    check = false;
                }else {
                    String newName = inputOutput("Please input new name");
                    products.name = newName;
                    System.out.println("Input price for product you want to edit");
                    float newPrice = Float.parseFloat(input.nextLine());
                    products.price = newPrice;
                    break;
                }
            }
        }
    }
    public void sortProduct(){
        Collections.sort(productList, new PriceComparator());
    }

}
