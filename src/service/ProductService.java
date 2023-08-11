package service;

import entity.Category;
import entity.Product;

public class ProductService {
    private Product[] sanphams;
    public ProductService(){
        sanphams = new Product[20];
    }
    public void plusProduct (Product product, int index){
        sanphams[index] = product;
    }
    public void deleteProduct (int index) {
        sanphams[index] = null;
    }
    public void displayProduct(){
        for (int index=0;index<sanphams.length;index++){
            System.out.println(sanphams[index]);
        }
    }
}
