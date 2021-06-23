package _12_java_collection_frame_work.exercise;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManagerLinkedList {
    LinkedList<Product> productLinkedList = new LinkedList<>();
    private static Scanner input = new Scanner(System.in);

    private static String inputOutput(String message) {
        System.out.println(message);
        String output = input.nextLine();
        return output;
    }

    public static void main(String[] args) {
        ProductManagerLinkedList productList = new ProductManagerLinkedList();
        System.out.println("----Manager Product by LinkedList----");
        int choice1;
        do {
            System.out.println("----Chọn chức năng----");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Xem sản phẩm");
            System.out.println("3.Sửa sản phẩm");
            System.out.println("4.Xóa sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm");
            System.out.println("6.Sắp xếp sản phẩm theo giá từ thấp đến cao");
            System.out.println("7.Thoát chương trình");
            choice1 = Integer.parseInt(input.nextLine());
            switch (choice1) {
                case 1:
                    productList.addProduct();
                    break;
                case 2:
                    productList.displayProduct();
                    break;
                case 3:
                    productList.editProduct();
                    break;
                case 4:
                    productList.deleteProduct();
                    break;
                case 5:
                    productList.searchProduct();
                    break;
                case 6:
                    productList.sortProduct();
                    break;
                case 7:
                    System.exit(7);
                    break;
            }
        } while (choice1 != 7);
    }

    void addProduct() {
        System.out.println("Input id for new product by LinkedList");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Input name for new product by LinkedList");
        String name = input.nextLine();
        System.out.println("Input price for new product by LinkedList");
        float price = Float.parseFloat(input.nextLine());
        Product newProduct = new Product(id, name, price);
        productLinkedList.add(newProduct);
    }

    void displayProduct() {
        if (productLinkedList.size() == 0) {
            System.out.println("No product on LinkedList");
        } else {
            for (Product products : productLinkedList) {
                products.display();
            }
        }
    }

    void editProduct() {
        if (productLinkedList.size() == 0) {
            System.out.println("No product on LinkedList");
        } else {
            System.out.println("Input id for product");
            int searchIdByLinkedList = Integer.parseInt(input.nextLine());
            boolean check = false;
            for (Product products: productLinkedList){
                if (searchIdByLinkedList==products.id){
                    check = true;
                    String newName = inputOutput("Please input new name");
                    products.name = newName;
                    System.out.println("Input price for product you want to edit");
                    float newPrice = Float.parseFloat(input.nextLine());
                    products.price = newPrice;
                    break;
                }
            }
            if (check=false){
                System.out.println("No product by Linked List found");
            }
        }
    }
    void deleteProduct() {
        if (productLinkedList.size() == 0) {
            System.out.println("No product on LinkedList");
        } else {
            System.out.println("Input id for product by linked list you want to delete");
            int searchIdByLinkedList = Integer.parseInt(input.nextLine());
            boolean check = false;
            for (Product products: productLinkedList){
                if (searchIdByLinkedList==products.id){
                    check = true;
                    productLinkedList.remove(products);
                    break;
                }
            }
            if (check=false){
                System.out.println("No product by Linked List found");
            }
        }
    }
    void searchProduct() {
        if (productLinkedList.size() == 0) {
            System.out.println("No product on LinkedList");
        } else {
            System.out.println("Input name for product");
            String editName = input.nextLine();
            boolean check = false;
            for (Product products: productLinkedList){
                if (editName.equals(products.name)){
                    check = true;
                    products.display();
                    break;
                }
            }
            if (check=false){
                System.out.println("No product by Linked List found");
            }
        }
    }
    public void sortProduct(){
        Collections.sort(productLinkedList, new PriceComparator());
    }


}
