import java.util.Random;

public class MarketPlace implements Building{

    //fields for the marketplace
    private String name;
    private String location;
    private String[] standTypes = {"farmers", "herdsmen", "street-cooks", "librarians", "bakers","florist","stone-smith"};
    private int standAMT;
    private int width;
    private int length;
    private int height;

    public MarketPlace(String name, String location, int standAMT, int width, int length, int height) {
        this.name = name;
        this.location = location;
        this.standAMT = standAMT;
        this.width = width;
        this.length = length;
        this.height = height;
    }
    //Implementation of Methods
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

    Random randStand = new Random();

    @Override
    public void whatIs() {
        // randomizer
        int standValue1 = randStand.nextInt(0,6);
        int standValue2 = randStand.nextInt(0,6);
        //Prevents the same output
        if (standValue2 == standValue1){
            standValue2 = randStand.nextInt(0,6);
        }

        //Helps with phrasing
        String varyH = height == 0 ? "it's height is too hard to tell." : height + "in height.";
        //The full sentences
        System.out.println("There is a " + name + "that lives in the " + location + ". There are about " + standAMT + " vendors there.\n" +
                            "Some are " + standTypes[standValue1] + " while others are " + standTypes[standValue2] + ".");
        System.out.println("The " + name + "'s dimensions are about " + width + " in width, " + length + " in length and " + varyH);

        System.out.println();
    }
}
