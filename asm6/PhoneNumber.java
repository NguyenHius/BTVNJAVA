package main.asm6;

import java.util.ArrayList;

public class PhoneNumber {
    public String name;
    public ArrayList<String> phoneList;

    public PhoneNumber(String name) {
        this.name = name;
        this.phoneList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getPhoneList() {
        return phoneList;
    }
}

