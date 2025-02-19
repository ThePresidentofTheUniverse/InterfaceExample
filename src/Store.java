public class Store implements Building {

    //fields for a store
    private String name;
    private String storeType;
    private int employees;
    private String genMerch;
    private int openTime;
    private int closeTime;

    //constructor
    public Store(String name, String storeType, int employees, String genMerch, int openTime, int closeTime) {
        this.name = name;
        this.storeType = storeType;
        this.employees = employees;
        this.genMerch = genMerch;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }
    //Implement methods
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
        System.out.println(name + " is a " + storeType);
    }


}
