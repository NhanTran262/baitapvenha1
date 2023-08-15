import entity.Category;
import entity.Product;
import service.CategoryService;
import service.ProductService;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Category dt1 = new Category(1, "Thời trang nam");
//        CategoryService.plusCategory(dt1, 0);
////        ProductService productService = new ProductService();
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


        UserService.themDuLieu();

    }
}