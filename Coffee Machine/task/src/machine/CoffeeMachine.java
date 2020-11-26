package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        /*System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");*/
        /*System.out.println("Write how many cups of coffee you will need: ");
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        System.out.println("For " + cups + " cups of coffee you will need:");
        int water = cups * 200;
        int milk = cups * 50;
        int beans = cups * 15;
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");*/
        System.out.println("Write how many ml of water the coffee machine has:");
        Scanner scanner = new Scanner(System.in);
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsNeed = scanner.nextInt();
        int cupWater = water / 200;
        int cupMilk = milk / 50;
        int cupBeans = beans / 15;
        int minCup = 0;
        if (cupWater > cupMilk) {
            minCup = cupMilk;
        } else {
            minCup = cupWater;
        }

        if (minCup > cupBeans) {
            minCup = cupBeans;
        }

        if (minCup == cupsNeed) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (minCup < cupsNeed) {
            System.out.println("No, I can make only " + minCup + " cup(s) of coffee");
        } else {
            minCup -= cupsNeed;
            System.out.println("Yes, I can make that amount of coffee (and even " + minCup + " more than that)");
        }
    }
}
