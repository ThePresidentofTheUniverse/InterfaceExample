public class BuildingDriver {
    public static void main(String[] args) {
        Building store1 = new Store("Marfusha's Bakery", "Bakery","Eastern District", 2, "Muffins", 500, 1300, 10,10,20);
        Building amphitheatre1 = new Amphitheatre("Roman Colosseum", "Gladitorial", "Southern District", true, 50000, 1700, 100,100,200);

        store1.whatIs();
        amphitheatre1.whatIs();
    }
}
