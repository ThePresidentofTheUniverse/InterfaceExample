import java.util.Scanner;

public class BuildingDriver {
    public static void main(String[] args) {
        //Makes it easier to read each item
        Scanner scan = new Scanner(System.in);

        //Information of each building.
        Building store1 = new Store("Marfusha's Bakery", "Bakery","Eastern District", 2, "Muffins", 500, 1300, 30,20,50, "muffin", "loaf of bread", "Doughnut", "pastry");
        Building store2 = new Store("Dochka's Armory", "BlackSmith","Western District", 1,"Swords", 1000, 1700,25,45,30, "sword", "hammer", "spear", "helmet");
        Building amphitheatre1 = new Amphitheatre("Roman Colosseum", "Gladitorial", "Southern District", true, 50000, 1700, 1000,1000,2000);
        Building amphitheatre2 = new Amphitheatre("Hidden Orchard", "theatrical", "Eastern District", false, 2000, 1800, 100, 100, 50);
        Building house1 = new House("Marfusha's Apartment","Eastern District", "Marfusha",2,30,20,50,true);
        Building house2 = new House("Dochka's Home", "Western District", "Dochka", 1, 45, 45, 60, false);

        // Allows user to click through each item
        store1.whatIs();
        scan.nextLine();

        house1.whatIs();
        scan.nextLine();

        store2.whatIs();
        scan.nextLine();

        house2.whatIs();
        scan.nextLine();

        amphitheatre1.whatIs();
        scan.nextLine();

        amphitheatre2.whatIs();
        scan.nextLine();
    }
}
