import java.io.Serializable;

public class Contact implements Serializable {
    private String name;
    private String email;
    private Integer age;
    private String phone;

    // Constructor
    public Contact(String name, String email, Integer age, String phone) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Método para imprimir la información del contacto
    public String print() {
        return "Name: " + name + ", Email: " + email + ", Age: " + age + ", Phone: " + phone;
    }
}
