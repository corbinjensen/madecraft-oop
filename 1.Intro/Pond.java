public class Pond {
    public static void main(String[] args) {
        String me = "june";
        // <type> <name> = new <type>()
        Duck mobyDuck = new Duck("Moby",90/3,"celery");
        Duck wolfgangDuck = new Duck("Wolfgang",60/3,"burgers");

        mobyDuck.waddle();
        wolfgangDuck.waddle();

        System.out.println(mobyDuck);
    }
}