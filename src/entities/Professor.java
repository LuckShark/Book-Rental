package entities;

public class Professor extends Person{
    private String position;

    public Professor(int registration, String name, String email, int telephone, String position) {
        super(registration, name, email, telephone);
        this.position = position;
    }

    public String getPosition() {return position;}
    public void setPosition(String position) {this.position = position;}

    @Override
    public String toString() {
        return getName()+", "+
                position;
    }
}
