public class House implements Building {

    //Fields for a house
    private String name;
    private String location;
    private String owner;
    private int peopleAMT;
    private int width;
    private int length;
    private int height;
    private boolean aboveStore;

    //Constructor
    public House(String name,String location,String owner, int peopleAMT, int width, int length, int height, boolean aboveStore) {
        this.name = name;
        this.location = location;
        this.owner = owner;
        this.peopleAMT = peopleAMT;
        this.width = width;
        this.length = length;
        this.height = height;
        this.aboveStore = aboveStore;
    }

    //Implements methods
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
        //The booleans that help with phrasing.
        String homeType = (aboveStore ? "an apartment" : "a house");
        String pluralAMT = (peopleAMT > 1 ? peopleAMT + " people.\n" : "just themselves.\n");
        String homeLoc = (aboveStore ? "above their store " : "somewhere ");
        // The full sentences.
        System.out.println(owner + " owns " + homeType + " that houses "  + pluralAMT + "They live " + homeLoc + "in the " + location + ".\n" +
                "Their home is about " + width + " in width, " + length + " in length and " + height + " in height.\n");
    }
}
