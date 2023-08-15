package entity;

public class Seller extends User{
    private String nameStore;
    private int doanhSo;

    public Seller(String id, String password, String name,String nameStore, int doanhSo) {
        super(id, password, name);
        this.doanhSo = doanhSo;
        this.nameStore = nameStore;
    }

    public static void ban(){

    }

    @Override
    public String toString() {
        return "Seller{" +
                "nameStore='" + nameStore + '\'' +
                ", doanhSo=" + doanhSo +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
