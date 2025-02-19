public class Amphitheatre implements Building {

    //fields for amphitheatre
    private String name;
    private String location;
    private String upcomingEvent;
    private int eventTime;
    private boolean hasConcessions;
    private int seats;
    private int width;
    private int length;
    private int height;

    //constructor
    public Amphitheatre(String name, String upcomingEvent,String location ,boolean hasConcessions, int seats, int eventTime,int width,int length,int height) {
        this.name = name;
        this.upcomingEvent = upcomingEvent;
        this.hasConcessions = hasConcessions;
        this.seats = seats;
        this.eventTime = eventTime;
        this.location = location;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    //Implementation of methods
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getLocation() {
        return location;
    }
    @Override
    public double getWidth() {
        return width;
    }
    @Override
    public double getLength() {
        return length;
    }
    @Override
    public double getHeight() {
        return height;
    }
    @Override
    public void whatIs() {
        System.out.println("The " + name + " is going to be showing a " + upcomingEvent + " event at " + eventTime + ". There " + hasConcessions + " concessions.\n" +
                "The building itself is " + width + " in width, " + length + " in length, " + height + " in height and can hold up to " + seats + " people.\n" +
                "It can be found in the " + location + ".");
    }
}
