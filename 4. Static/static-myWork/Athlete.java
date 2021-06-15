/*
What is STATIC - Static in java is fixed to a class so it cannot
be personalized by any instances of that class. When changed for one
it changes for all of them. Lives outside of instances. 

Main method must be static.

*/

public class Athlete {

    private String name;
    private int speed;
    private static String marathonLocation;
    private int bibNumber;
    private static int runnersInRace;

    public Athlete(String name, int speed) {
        this.name = name;
        this.speed = speed;
        runnersInRace++;
        this.bibNumber = runnersInRace;
    }

    public void setMarathonLocation(String marathonLocation) {
        this.marathonLocation = marathonLocation;
    }

    public static int getRunnersInRace() {
        return runnersInRace;
    }

    @Override
    public String toString() {
        return "Athlete " + name + 
        " is running at " + speed +
        " mph at " + marathonLocation + " under number " + bibNumber;
    }
} // end class Athlete