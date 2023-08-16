import entity.*;
import service.UserService;
import service.CategoryService;
import service.ProductService;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static service.UserService.themDuLieu;


public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Category dt1 = new Category(1, "Thời trang nam");
//        CategoryService.plusCategory(dt1, 0);
//        ProductService productService = new ProductService();
//
//        Category dt2 = new Category(2, "Thời trang nữ");
//        CategoryService.plusCategory(dt2,1);
//
//        CategoryService.displayCategory();


        /*Product ao = new Product(1, "Áo sơ mi", "Trắng", 150000, dt1);
        ProductService.plusProduct(ao, 0);
        Product quan = new Product(2, "Quần tây", "Đen", 250000, dt1);
        ProductService.plusProduct(quan, 1);*/



        /*Product vay = new Product(3, "Váy hoa", "Trắng", 200000, dt2);
        ProductService.plusProduct(vay, 2);
        Product chanvay = new Product(4, "Chân váy da", "Đen", 300000, dt2);
        ProductService.plusProduct(chanvay, 3);*/
        //categoryService.plusCategory(dt2, 1);


//        Category dt3 = new Category(3, "Điện thoại");
        /*Product phone = new Product(5, "Iphone 15", "Hồng", 30000000, dt3);
        ProductService.plusProduct(phone, 4);*/
        //categoryService.plusCategory(dt3, 2);


//        Category dt4 = new Category(4, "Thiết bị điện tử ");
        /*Product maylanh = new Product(6, "Toshiba", "Trắng", 15000000, dt4);
        ProductService.plusProduct(maylanh, 5);*/
        //categoryService.plusCategory(dt4, 3);


//        Category dt5 = new Category(5, "Laptop");
        /*Product laptop = new Product(7, "Dell 5200 2in1", "Đen", 22000000, dt5);
        ProductService.plusProduct(laptop, 6);*/
        //categoryService.plusCategory(dt5, 4);

//        categoryService.deleteCategory(0);
//        productService.deleteProduct(0);


//        System.out.println("Nhập SL danh mục: ");
//        int slCategory = sc.nextInt();
//        sc.nextLine();
//       CategoryService categoryService = new CategoryService(slCategory);

        //categoryService.displayCategory();
        //ProductService.displayProduct();


//        UserService.
//        UserService.themDuLieu();


//        while (true) {
//
//            Scanner scanner = new Scanner(System.in);
//            int choice = scanner.nextInt();
//
////            if(choice > 4) {
////                break;
////            } else if (choice == 1) {
////                UserService.themDuLieu(new Customer("1", "123456", "Kiệt lớn", 100000000),0);
////            } else if (choice == 2) {
////                UserService.themDuLieu(new Admin("2", "123456", "Kiệt nhỏ"),1);
////            } else if (choice == 3) {
////                UserService.themDuLieu(new Manager("3", "123456", "Nhân",10000000.0),2);
////            } else if (choice == 4) {
////                UserService.themDuLieu(new Seller("4","123456","Thịnh","ABC",1000),3);
////            } else {
////                System.out.println("Out");
////            }
//
//            switch (choice) {
//                case 1:
//                    UserService.themDuLieu(new Customer("1", "123456", "Kiệt lớn", 100000000),0);
//                    UserService.themDuLieu(new Customer("5","147852","Thắng",100000000),4);
//                    break;
//                case 2:
//                    UserService.themDuLieu(new Admin("2", "123456", "Kiệt nhỏ"),1);
//                    break;
//                case 3:
//                    UserService.themDuLieu(new Manager("3", "123456", "Nhân", 10000000.0),2);
//                    break;
//                case 4:
//                    UserService.themDuLieu(new Seller("4", "123456", "Thịnh", "ABC", 1000),3);
//                    break;
//                default:
//                    System.out.println("Out");
//                    break;
//            }
//            UserService.themDuLieu();
//
//
//            }
        Customer customer = new Customer("1", "123", "chinhdeptrai" ,0L);
        UserService.themDuLieu(customer, 0);

        Admin admin = new Admin("2", "123", "chinhxautrai");
        UserService.themDuLieu(admin, 1);

        Manager manager = new Manager("3", "123", "chinhsieugiau" ,0L);
        UserService.themDuLieu(manager, 2);

        Seller seller = new Seller("4", "123", "chinhsale" , "codegym", 5);
        UserService.themDuLieu(seller, 3);

        UserService.dangNhap(2);

        }
    }
