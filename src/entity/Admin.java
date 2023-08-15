package entity;

public class Admin extends User{
    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Admin(String id, String password, String name) {
        super(id, password, name);
    }

    public void xemThongtincaccuahang(){

    }

}
