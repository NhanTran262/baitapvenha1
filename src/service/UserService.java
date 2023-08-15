package service;

import entity.*;

public class UserService {
    private static User[] users = new User[10];
    int index = 0;

    public static void themDuLieu(String id,String password, String name,long soDu) {
        Customer kietLon = new Customer("1", "123456", "Kiệt lớn", 100000000);
        users[0] = kietLon;

        for (int index = 0; index < users.length; index++) {
            System.out.println(users[index]);
        }
    }
        public static void themDuLieu(String id,String password, String name) {
            Admin kietNho = new Admin("2", "123456", "Kiệt nhỏ");
            users[1] = kietNho;

            for (int index = 0; index < users.length; index++) {
                System.out.println(users[index]);
            }
        }
        public static void themDuLieu(String id, String password, String name, double luong) {
            Manager nhan = new Manager("3", "123456", "Nhân",10000000);
            users[2] = nhan;

            for (int index = 0; index < users.length; index++) {
                System.out.println(users[index]);
            }
    }
        public static void themDuLieu(String id, String password, String name, String nameStore, int doanhSo) {
        Seller thinh = new Seller("4","123456","Thịnh","ABC",1000);
        users[3] = thinh;

        for (int index = 0; index < users.length; index++) {
            System.out.println(users[index]);
        }

    }

}
