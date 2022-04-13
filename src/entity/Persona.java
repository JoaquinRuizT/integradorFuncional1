package entity;

public class Persona {

    private String name;
    private String email;
    private String birthplace;
    private Integer amount;

    public Persona() {
    }

    public Persona(String name, String email, String birthplace, Integer amount) {
        this.name = name;
        this.email = email;
        this.birthplace = birthplace;
        this.amount = amount;
    }

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

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(int ID) {
        this.amount = ID;
    }

    @Override
    public String toString() {
        return "Person {" + "name: " + name + ", email: " + email + ", birthplace: " + birthplace + ", amount: $" + amount + "}";
    }
    
    
    
}