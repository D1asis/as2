import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your coffee: (1) Espresso (2) Latte");
        int coffeeChoice = scanner.nextInt();

        Coffee coffee;

        if (coffeeChoice == 1) {
            coffee = new Espresso();
        } else if (coffeeChoice == 2) {
            coffee = new Latte();
        } else {
            System.out.println("Invalid choice. Defaulting to Espresso.");
            coffee = new Espresso();
        }

        System.out.println("Do you want to add sugar? (y/n)");
        String addSugar = scanner.next().toLowerCase();

        if (addSugar.equals("y")) {
            coffee = new SugarDecorator(coffee);
        }

        System.out.println("Do you want to add milk? (y/n)");
        String addMilk = scanner.next().toLowerCase();

        if (addMilk.equals("y")) {
            coffee = new MilkDecorator(coffee);
        }

        System.out.println("Your Coffee: " + coffee.getDescription());
        System.out.println("Total Cost: $" + coffee.cost());

        scanner.close();
    }
}



