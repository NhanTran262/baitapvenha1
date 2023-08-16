package service;

import entity.*;

public class UserService {
    private static User[] users = new User[10];

    private static IEat may = new Machine();

    int index = 0;

    public static void themDuLieu(Customer kietLon, int index) {
        users[index] = kietLon;
        may.eat();
    }
    public static void themDuLieu(Admin kietNho, int index) {
        users[index] = kietNho;
    }
    public static void themDuLieu(Manager nhan, int index) {
        users[index] = nhan;
    }
    public static void themDuLieu(Seller thinh, int index) {
        users[index] = thinh;
    }
    public static void themDuLieu(){
        for (int index = 0; index < users.length; index++) {
            System.out.println(users[index]);
        }
    }
    public static void dangNhap(int index) {
        users[index].dangNhap("6", "123");
    }

}
