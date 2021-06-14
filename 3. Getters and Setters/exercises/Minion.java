package exercises;

public class Minion {
    private String name;
    private int eyes;
    private String color;
    private String master;

    // create a constructor
    Minion(
        String name, 
        int eyes,
        String color,
        String master
        ) 
        {
            this.name = name; 
            this.eyes = eyes;
            this.color = color;
            this.master = master;
        } // end constructor

    // getters and setters for
    // the member vars.

    void getColor(){
        System.out.println(this.color); 
    }

    void getName(){
        System.out.println(this.name); 
    }

    void getEyes(){
        System.out.println(this.eyes);
    }

    void getMaster() {
        System.out.println(this.master); 
    }

    void setColor(String color) {
        this.color = color;
    }

    void setName(String name) {
        this.name = name;
    }

    int setEyes(int eyes) {
        return this.eyes = eyes;
    }

    void setMaster(String master) {
        this.master = master;
    }

    
}
