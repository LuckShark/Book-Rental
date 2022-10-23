package entities;

public abstract class Person {
    private int registration;
    private String name;
    private String email;
    private int telephone;

    public Person(int registration, String name, String email, int telephone) {
        this.registration = registration;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }

    //Getters & Setters
    public int getRegistration() {return registration;}
    public void setRegistration(int registration) {this.registration = registration;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public int getTelephone() {return telephone;}
    public void setTelephone(int telephone) {this.telephone = telephone;}

    public void mostrarInfoPessoa(){
        System.out.println("Name: "+getName());
        System.out.println("Registration: "+getRegistration());
        System.out.println("Email: "+getEmail());
        System.out.println("Telephone: "+getTelephone());
    }
}
