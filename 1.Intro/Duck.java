public class Duck {

    // member variables: data
    private String name;
    private int lifeExpectancy;
    private String favoriteFood;

    public Duck(String name, int lifeExpectancy, String favoriteFood) {
        super();
        this.name = name;
        this.lifeExpectancy = lifeExpectancy;
        this.favoriteFood = favoriteFood;
    }

    // methods: functionality
    void waddle() {
        lifeExpectancy++;
        System.out.println(this.name + " is waddling");
    }

    void quack() {
        System.out.println("quack quack");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "My name is " + name + " I like to eat " + favoriteFood + " lifeExpectancy: " + lifeExpectancy;
    }
}