package service;

import entity.Category;

public class CategoryService {
    private Category[] danhmucs;
public CategoryService(){
    danhmucs = new Category[5];
}
public void plusCategory (Category category, int index){
    danhmucs[index] = category;
}
    public void deleteCategory (int index) {
        danhmucs[index] = null;
    }
public void displayCategory(){
    for (int index=0;index<danhmucs.length;index++){
        System.out.println(danhmucs[index]);
    }
}

}
