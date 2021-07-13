package finalExamModule2.services;

import java.util.List;

public interface Service<T> {
    List<T> readDataFromFile();
    void add();
    void edit();
    void disPlay();

}
