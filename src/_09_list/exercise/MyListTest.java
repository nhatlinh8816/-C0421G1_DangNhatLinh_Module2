package _09_list.exercise;

import java.util.LinkedList;

public class MyListTest {
    public static class Fruit {
        String name;
        String color;

        public Fruit(String name, String color) {
            this.name = name;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Fruit{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }

        public Fruit() {
        }

        @Override
        public boolean equals(Object obj) {
            Fruit fruit = (Fruit)obj;
            return this.name.equals(((Fruit)obj).name)
                    && this.color==((Fruit)obj).color;
        }
    }

    public static void main(String[] args) {

        MyArrayList<Fruit> myArrayList = new MyArrayList<>(5);
        myArrayList.ensureCapacity(5);
        myArrayList.add(new Fruit("Apple","Red"));
        myArrayList.add(new Fruit("Grapes","Purple"));
        myArrayList.add(new Fruit("Water Melon","green"),1);
        for (int i = 0;i<myArrayList.size();i++){
            System.out.println(myArrayList.get(i).toString());
        }
        myArrayList.remove(0);
        System.out.println("After remove");
        for (int i = 0;i<myArrayList.size();i++){
            System.out.println(myArrayList.get(i).toString());
        }
        MyArrayList<Fruit> myArrayList1 = myArrayList.clone();
        System.out.println("myArrayList1 copy is");
        for (int i = 0;i<myArrayList1.size();i++){
            System.out.println(myArrayList1.get(i).toString());
        }
        int index = myArrayList1.indexOf(new Fruit("Water Melon","green"));
        System.out.println("Index of elements input is " +index);
        MyArrayList<Fruit> myArrayList2 = myArrayList1.clone();
        System.out.println("myArrayList2 copy is");
        for (int i = 0;i<myArrayList2.size();i++){
            System.out.println(myArrayList2.get(i).toString());
        }
        System.out.println("myArrayList2 size is "+myArrayList2.size());
        System.out.println("myArrayList2 index 1 is " +myArrayList2.get(1));
        myArrayList2.clear();
        for (int i = 0;i<myArrayList2.size();i++){
            System.out.println(myArrayList2.get(i).toString());
        }
    }

}