public class Store implements Building {

    //fields for a store
    private String name;
    private String storeType;
    private String location;
    private int employees;
    private String genMerch;
    private int openTime;
    private int closeTime;
    private int width;
    private int length;
    private int height;


    //constructor
    public Store(String name, String storeType,String location, int employees, String genMerch, int openTime, int closeTime,int width,int length,int height) {
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
    @Override
    public void whatIs() {
        String empAMT = employees > 1 ? "" : "";
        System.out.println(name + " is a " + storeType + " located in the " + location + ".\nThere are " + employees + " usually sell " + genMerch + " and are open from " + openTime + " to " + closeTime + ".");
        System.out.println("The store's dimensions are " +width+ " in width, " + length + " in length and " + height + " in height.\n");
    }


}
