package entity;

import java.util.Arrays;

public class Manager extends User{
    private Seller[] sellers;
    private double luong;

    public Manager(String id, String password, String name, double luong) {
        super(id, password, name);
        this.luong = luong;
    }

    public void traluong(){

    }

    @Override
    public String toString() {
        return "Manager{" +
                "sellers=" + Arrays.toString(sellers) +
                ", luong=" + luong +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
