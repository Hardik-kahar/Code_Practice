package myapp.oops;

public class Encapsulation {

    private String name;
    private int ID ;

    public String getName() {
        // we can add validation code for security purpose
        return name;
    }
    public void setName(String name) {
        // we can add validation code for security purpose
        this.name = name;
    }
    public int getID() {
        // we can add validation code for security purpose
        return ID;
    }
    public void setID(int iD) {
        // we can add validation code for security purpose
        ID = iD;
    }
}
