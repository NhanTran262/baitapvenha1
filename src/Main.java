import entity.Category;
import entity.Product;
import service.CategoryService;
import service.ProductService;

public class Main {
    public static void main(String[] args) {
        CategoryService categoryService = new CategoryService();
        ProductService productService = new ProductService();


        Category dt1 = new Category(121,"Thời trang nam");
        Product ao = new Product(221,"Áo sơ mi","Trắng",150000,dt1);
        productService.plusProduct(ao,0);
        Product quan  = new Product(222,"Quần tây","Đen",250000,dt1);
        productService.plusProduct(quan,1);
        categoryService.plusCategory(dt1,0);


        Category dt2 = new Category(122,"Thời trang nữ");
        Product vay = new Product(223,"Váy hoa","Trắng",200000,dt2);
        productService.plusProduct(vay,2);
        Product chanvay = new Product(224,"Chân váy da","Đen",300000,dt2);
        productService.plusProduct(chanvay,3);
        categoryService.plusCategory(dt2,1);


        Category dt3 = new Category(123,"Điện thoại");
        Product phone =new Product(456,"Iphone 15","Hồng",30000000,dt3);
        productService.plusProduct(phone,4);
        categoryService.plusCategory(dt3,2);


        Category dt4 = new Category(124,"Thiết bị điện tử ");
        Product maylanh = new Product(789,"Toshiba","Trắng",15000000,dt4);
        productService.plusProduct(maylanh,5);
        categoryService.plusCategory(dt4,3);

        Category dt5 = new Category(125,"Laptop");
        Product laptop = new Product(258,"Dell 5200 2in1","Đen",22000000,dt5);
        productService.plusProduct(laptop,6);
        categoryService.plusCategory(dt5,4);

//        categoryService.deleteCategory(0);

//        categoryService.displayCategory();
        productService.displayProduct();









    }
}