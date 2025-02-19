public class Amphitheatre implements Building {

    //fields for amphitheatre
    private String name;
    private String upcomingEvent;
    private int eventTime;
    private boolean hasConcessions;
    private int seats;

    //constructor
    public Amphitheatre(String name, String upcomingEvent, boolean hasConcessions, int seats, int eventTime) {
        this.name = name;
        this.upcomingEvent = upcomingEvent;
        this.hasConcessions = hasConcessions;
        this.seats = seats;
    }

    //Implementation of methods
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getLocation() {
        return "";
    }
    @Override
    public double getWidth() {
        return 0;
    }
    @Override
    public double getLength() {
        return 0;
    }
    @Override
    public double getHeight() {
        return 0;
    }
    @Override
    public void whatDo() {
        System.out.println(name + " is going to be showing a " + upcomingEvent + " at " +eventTime);
    }
}
