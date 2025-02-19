public class BuildingDriver {
    public static void main(String[] args) {
        Building store1 = new Store("Marfusha's Bakery", "Bakery","Eastern District", 2, "Muffins", 500, 1300, 30,20,30);
        Building store2 = new Store("Dochka's Armory", "BlackSmith","Western District", 1,"Swords", 1000, 1700,25,45,30);
        Building amphitheatre1 = new Amphitheatre("Roman Colosseum", "Gladitorial", "Southern District", true, 50000, 1700, 1000,1000,2000);
        Building amphitheatre2 = new Amphitheatre("Hidden Orchard", "theatrical", "Eastern District", false, 2000, 1800, 100, 100, 50);

        store1.whatIs();
        store2.whatIs();
        amphitheatre1.whatIs();
        amphitheatre2.whatIs();
    }
}
