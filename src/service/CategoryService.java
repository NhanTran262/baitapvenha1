package service;

import entity.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategoryService {
    Scanner sc = new Scanner(System.in);
    private static Category[] danhmucs = new Category[5];;

    public CategoryService() {
        danhmucs = new Category[5];
    }

    public static void plusCategory(Category category, int index) {
        danhmucs[index] = category;
    }

    public void deleteCategory(int index) {
        danhmucs[index] = null;
    }

    public static void displayCategory() {
        for (int index = 0; index < danhmucs.length; index++) {
            System.out.println(danhmucs[index]);
        }

//        System.out.println("Nhập SL danh mục: ");
//        int slCategory = sc.nextInt();
//        sc.nextLine();
////        CategoryService categoryService = new CategoryService(slCategory);
//
//        for (int index = 0; index < slCategory; index++){
//            int idCategory = index + 1;
//            System.out.println("Nhập tên danh mục: ");
//            String nameCategory = sc.nextLine();
//            Category category = new Category(idCategory,nameCategory);
//
//        }




        /*System.out.println("ID Category là: ");
        int idCategory = sc.nextInt();

        // Xét id Category

        List<Category> danhMucList = new ArrayList<>();
        danhMucList.add(new Category(1));
        danhMucList.add(new Category(2));
        danhMucList.add(new Category(3));
        danhMucList.add(new Category(4));
        danhMucList.add(new Category(5));


        boolean idTrungNhau = false;
        for (Category danhMuc : danhMucList) {
            if (danhMuc.getId() == idCategory) {
                idTrungNhau = true;
                break;
            }
        }

        if (idTrungNhau) {
            System.out.println("ID trùng nhau");
        } else {
            System.out.println("ID không trùng nhau");
        }*/

    }
}
