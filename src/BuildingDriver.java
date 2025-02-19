public class BuildingDriver {
    public static void main(String[] args) {
        Building store1 = new Store("Marfusha's Bakery", "Bakery","Eastern District", 2, "Muffins", 500, 1300, 30,20,50);
        Building store2 = new Store("Dochka's Armory", "BlackSmith","Western District", 1,"Swords", 1000, 1700,25,45,30);
        Building amphitheatre1 = new Amphitheatre("Roman Colosseum", "Gladitorial", "Southern District", true, 50000, 1700, 1000,1000,2000);
        Building amphitheatre2 = new Amphitheatre("Hidden Orchard", "theatrical", "Eastern District", false, 2000, 1800, 100, 100, 50);
        Building house1 = new House("Marfusha's Apartment","Eastern District", "Marfusha",2,30,20,50,true);
        Building house2 = new House("Dochka's Home", "Western District", "Dochka", 1, 45, 45, 60, false);

        store1.whatIs();
        house1.whatIs();
        store2.whatIs();
        house2.whatIs();
        amphitheatre1.whatIs();
        amphitheatre2.whatIs();
    }
}
