package service;

import entity.Admin;
import entity.Customer;
import entity.User;

public class UserService {
    private static User[] users = new User[10];

    public static void themDuLieu(){
        Customer kietLon = new Customer("1","123456","dat",100000000);
        users[0] = kietLon;
        Admin kietNho = new Admin("2","123456","kietnho");
        users[1] = kietNho;
        for (int index = 0; index < users.length; index++) {
            System.out.println(users[index]);
        }

    }

}
