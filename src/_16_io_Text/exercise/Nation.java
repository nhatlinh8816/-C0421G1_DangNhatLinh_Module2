package _16_io_Text.exercise;

import java.util.ArrayList;
import java.util.List;

public class Nation {
    public int id;
    public String code;
    public String name;

    public Nation(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public Nation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
