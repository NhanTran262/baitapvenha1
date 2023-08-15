package entity;

public class Customer extends User{
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
}
