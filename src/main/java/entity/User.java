package entity;

/**
 * 用户实体类
 * */
public class User {

    // 这里比对数据库表中的字段，表中创建了id,username,password三个字段
    // id
    private int id;
    // username
    private String username;
    // password
    private String password;

    // 生成get和set方法
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
    }


}