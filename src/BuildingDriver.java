import java.util.Scanner;

// Running a test with how an enumeration can work
enum CleanUp {ERASE}

public class BuildingDriver {
    public static void main(String[] args) {
        CleanUp clear = CleanUp.ERASE;

        //Makes it easier to read each item
        Scanner scan = new Scanner(System.in);
        String userInput;
        String quitProgram = "N";

        //Information of each building.
        Building store1 = new Store("Marfusha's Bakery", "Bakery", "Eastern District", 2, "Muffins", 500, 1300, 30, 20, 50, "muffin", "loaf of bread", "Doughnut", "pastry");
        Building store2 = new Store("Dochka's Armory", "BlackSmith", "Western District", 1, "Swords", 1000, 1700, 25, 45, 30, "sword", "hammer", "spear", "helmet");
        Building amphitheatre1 = new Amphitheatre("Not-Roman Colosseum", "Gladitorial", "Southern District", true, 50000, 1700, 1000, 1000, 2000);
        Building amphitheatre2 = new Amphitheatre("Hidden Orchard Theatre", "theatrical", "Eastern District", false, 2000, 1800, 100, 100, 50);
        Building house1 = new House("Marfusha's Apartment", "Eastern District", "Marfusha", 2, 30, 20, 50, true);
        Building house2 = new House("Dochka's Home", "Western District", "Dochka", 1, 45, 45, 60, false);
        Building marketPlace1 = new MarketPlace("Marketplace", "Western District", 100, 250, 250, 0);

        //This will allow the user to explore each item freely
        while (quitProgram.equalsIgnoreCase("N"))
        {
            int i = 0;
            int t = 0;

            //The "home-page".
            System.out.println("Welcome to the city of LiaKyra.\nWhat location would you like to visit?");
            System.out.println("1 - Marfusha's Bakery");
            System.out.println("2 - Marfusha's Apartment");
            System.out.println("3 - Dochka's Armory");
            System.out.println("4 - Dochka's Home");
            System.out.println("5 - Not-Roman Colosseum");
            System.out.println("6 - Hidden Orchard Theatre");
            System.out.println("7 - Marketplace");
            System.out.println("\nTo close out of program, type \"exit\".");
            userInput = scan.nextLine();

            // very basic switch statement that could be made fancier.
            switch (userInput) {

                case "1":
                    do
                    {
                        System.out.println("\n");
                        t++;
                    } while (t < 5);
                store1.whatIs();
                System.out.println("\n Type 'R' to return to home page.");
                userInput = scan.nextLine();
                if (userInput.equalsIgnoreCase("r"))
                {
                    do
                    {
                        System.out.println("\n");
                        i++;
                    } while (i < 5);
                    break;
                }
                else
                {
                    System.out.println("\nUnknown input detected.\n");
                }
                case "2":
                    do
                    {
                        System.out.println("\n");
                        t++;
                    } while (t < 5);
                house1.whatIs();
                    System.out.println("\n Type 'R' to return to home page.");
                    userInput = scan.nextLine();
                    if (userInput.equalsIgnoreCase("r"))
                    {
                        do
                        {
                            System.out.println("\n");
                            i++;
                        } while (i < 5);
                        break;
                    }
                    else
                    {
                        System.out.println("\nUnknown input detected.\n");
                    }
                break;
                case "3":
                    do
                    {
                        System.out.println("\n");
                        t++;
                    } while (t < 5);
                store2.whatIs();
                    System.out.println("\n Type 'R' to return to home page.");
                    userInput = scan.nextLine();
                    if (userInput.equalsIgnoreCase("r"))
                    {
                        do
                        {
                            System.out.println("\n");
                            i++;
                        } while (i < 5);
                        break;
                    }
                    else
                    {
                        System.out.println("\nUnknown input detected.\n");
                    }
                break;
                case "4":
                    do
                    {
                        System.out.println("\n");
                        t++;
                    } while (t < 5);
                house2.whatIs();
                    System.out.println("\n Type 'R' to return to home page.");
                    userInput = scan.nextLine();
                    if (userInput.equalsIgnoreCase("r"))
                    {
                        do
                        {
                            System.out.println("\n");
                            i++;
                        } while (i < 5);
                        break;
                    }
                    else
                    {
                        System.out.println("\nUnknown input detected.\n");
                    }
                break;
                case "5":
                    do
                    {
                        System.out.println("\n");
                        t++;
                    } while (t < 5);
                amphitheatre1.whatIs();
                    System.out.println("\n Type 'R' to return to home page.");
                    userInput = scan.nextLine();
                    if (userInput.equalsIgnoreCase("r"))
                    {
                        do
                        {
                            System.out.println("\n");
                            i++;
                        } while (i < 5);
                        break;
                    }
                    else
                    {
                        System.out.println("\nUnknown input detected.\n");
                    }
                break;
                case "6":
                    do
                    {
                        System.out.println("\n");
                        t++;
                    } while (t < 5);
                amphitheatre2.whatIs();
                    System.out.println("\n Type 'R' to return to home page.");
                    userInput = scan.nextLine();
                    if (userInput.equalsIgnoreCase("r"))
                    {
                        do
                        {
                            System.out.println("\n");
                            i++;
                        } while (i < 5);
                        break;
                    }
                    else
                    {
                        System.out.println("\nUnknown input detected.\n");
                    }
                break;
                case "7":
                    do
                    {
                        System.out.println("\n");
                        t++;
                    } while (t < 5);
                marketPlace1.whatIs();
                    System.out.println("\n Type 'R' to return to home page.");
                    userInput = scan.nextLine();
                    if (userInput.equalsIgnoreCase("r"))
                    {
                        do
                        {
                            System.out.println("\n");
                            i++;
                        } while (i < 5);
                        break;
                    }
                    else
                    {
                        System.out.println("\nUnknown input detected.\n");
                    }
                break;
            }

            if (userInput.equalsIgnoreCase("exit")){
                System.out.println("Closing the program...");
                break;
            }
        }
    }
}