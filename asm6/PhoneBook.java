package main.asm6;

import java.util.ArrayList;

public class PhoneBook extends Phone{

    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for (int i = 0; i < PhoneList.size(); i++){
            if (PhoneList.get(i).name.equals(name)){
                if (PhoneList.get(i).phoneList.contains(phone)){
                    PhoneList.get(i).phoneList.add(phone);
                }
                return;
            }
        }
        PhoneNumber pn = new PhoneNumber(name);
        pn.phoneList.add(phone);
        PhoneList.add(pn);
    }

    @Override
    public void removePhone(String name) {

    }

    @Override
    public void updatePhone(String name, String newphone) {

    }

    @Override
    public void searchPhone(String name) {

    }

    @Override
    public void sort() {

    }
}
