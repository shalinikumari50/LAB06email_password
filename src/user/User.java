package user;

public class User {
    private String name;
    private String companyName;
    private int age;
    private String email;
    private String password;

    public User(String name, String companyName, int age) {
        this.name = name;
        this.companyName = companyName;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String createEmail() {
        return String.format("%s_%d@%s.com", getName().toLowerCase(), getAge(), getCompanyName().toLowerCase());
    }






}
