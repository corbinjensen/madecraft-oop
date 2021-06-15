import exercises.SeaCreature;

/*
 * 1. Create a class called Ocean.
 * 2. There make make a SeaCreature called “Spongebob”. 
 * 3. Use the methods below to make him eat, and laugh.
 * 4. Make Patrick and Squidward and print their name, and make them laugh.
 */

public class Ocean {
    
    public static void main(String[] args) {

        SeaCreature spongebob = new SeaCreature("Spongebob");

        spongebob.eat();

        SeaCreature patrick = new SeaCreature("Patrick");
        SeaCreature squidward = new SeaCreature("Squidward");

        System.out.println(patrick.getName());
        System.out.println(squidward.getName());
        
    }
    
}
