package user;

import java.util.Random;

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
        this.email = createEmail();
        this.password = createPassword();

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

    public String createPassword() {
        Random random = new Random();

        int randomNumber1 = random.nextInt(9);
        int randomNumber2 = random.nextInt(9);
        int randomNumber3 = random.nextInt(9);
        int randomNumber4 = random.nextInt(9);

        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        char randomAlphabet = alphabets.charAt(random.nextInt(alphabets.length()));

        String specialCharacters = "!@#$%&*";
        char randomSpecialCharacter = specialCharacters.charAt(random.nextInt(specialCharacters.length()));

        String first5CharOfName;
        if (name.length() < 5) {
            first5CharOfName = (name + "00000").substring(0, 5);
        } else {
            first5CharOfName = name.substring(0, 5);
        }

        return String.format("%c%d%d%d%d%s%s", randomAlphabet, randomNumber1, randomNumber2, randomNumber3, randomNumber4, first5CharOfName, randomSpecialCharacter);

    }







}
