package _case_Study.services;

import java.util.List;

public interface Service<T> {    //tạo class interface
    List<T> readData();     //đọc dữ liệu từ file
    void add();         //thêm mới
    void edit();        //sửa dữ liêu

}
