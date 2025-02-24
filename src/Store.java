import java.util.Random;

public class Store implements Building {

    //fields for a store
    private String name;
    private String storeType;
    private String location;
    private int employees;
    private String genMerch = "";
    private int openTime;
    private int closeTime;
    private int width;
    private int length;
    private int height;
    private String item0;
    private String item1;
    private String item2;
    private String item3;


    //constructor
    public Store(String name, String storeType, String location, int employees, String genMerch, int openTime, int closeTime, int width, int length, int height, String item0, String item1, String item2, String item3) {
        this.name = name;
        this.storeType = storeType;
        this.location = location;
        this.employees = employees;
        this.genMerch = genMerch;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.width = width;
        this.length = length;
        this.height = height;
        this.item0 = item0;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    //Implement methods
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

    //Random needed for item generation.
    Random randMerch = new Random();

    @Override
    public void whatIs() {
        //The boolean that assists with phrasing.
        String empAMT = employees > 1 ? " are " + employees + " employees" : " is " + employees + " employee";

        //Gives us a random value.
        int merchValue = randMerch.nextInt(0, 4);

        switch (merchValue) {

            case 0:
                genMerch = item0;
                break;
            case 1:
                genMerch = item1;
                break;
            case 2:
                genMerch = item2;
                break;
            case 3:
                genMerch = item3;
                break;
            default:
                genMerch = "interesting item";
                break;
        }
        ;

        //The full sentences.
        System.out.println(name + " is a " + storeType + " located in the " + location + ".\nThere" + empAMT + " that might sell you a " + genMerch + " and are open from " + openTime + " to " + closeTime + ".");
        System.out.println("The store's dimensions are " + width + " in width, " + length + " in length and " + height + " in height.\n");
    }
}