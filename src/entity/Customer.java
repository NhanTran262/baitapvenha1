package entity;

public class Customer extends User implements IEat {
    private long soDu;

    public Customer(String id, String password, String name, long soDu) {
        super(id, password, name);
        this.soDu = soDu;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + this.id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                "soDu=" + soDu +
                '}';
    }

    public void Mua(){

    }

    public void dangNhap(String id, String password) {
        System.out.println("chuyen sang trang homepage");
    }

    public void eat() {
        System.out.println("con nguoi an com");
    }
}
