package entity;

public class User {
    protected String id;
    protected String password;
    protected String name;


    public User(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;

    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void dangNhap(String id, String password){
return;
    }
    public void dangKy(){

    }
}
