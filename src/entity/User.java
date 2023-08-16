package entity;

public abstract class User {
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

    public abstract void dangNhap(String id, String password);


    public void dangKy(){

    }
}
