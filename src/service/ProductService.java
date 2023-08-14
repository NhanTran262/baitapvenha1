package service;

import entity.Category;
import entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    private static Product[] sanphams;
    static{
        sanphams = new Product[20];
    }
    public ProductService(){
        sanphams = new Product[20];
    }
    public static void plusProduct (Product product, int index){
        sanphams[index] = product;
    }
    public void deleteProduct (int index) {
        sanphams[index] = null;
    }
    public static void displayProduct(){
        for (int index=0;index<sanphams.length;index++){
            System.out.println(sanphams[index]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("ID Product là: ");
        int idProduct = sc.nextInt();

        //Xét id Product

        List<Product> sanPhamList = new ArrayList<>();
        sanPhamList.add(new Product(1));
        sanPhamList.add(new Product(2));
        sanPhamList.add(new Product(3));
        sanPhamList.add(new Product(4));
        sanPhamList.add(new Product(5));
        sanPhamList.add(new Product(6));
        sanPhamList.add(new Product(7));


        boolean idTrungNhau1 = false;
        for (Product sanPham : sanPhamList) {
            if (sanPham.getId() == idProduct) {
                idTrungNhau1 = true;
                break;
            }
        }

        if (idTrungNhau1) {
            System.out.println("ID trùng nhau");
        } else {
            System.out.println("ID không trùng nhau");
        }
    }
}
