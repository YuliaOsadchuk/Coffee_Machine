package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int disposableCups = 9;
    public static int money = 550;

    public static void main(String[] args) {
        print();
        System.out.println("Write action (buy, fill, take):");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.next();
        switch (action) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
        }
        print();

        /*System.out.println("Write how many ml of water the coffee machine has:");
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
        }*/
    }

    public static void print() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(money + " of money");
    }

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        Scanner scanner = new Scanner(System.in);
        int drink = scanner.nextInt();
        switch (drink) {
            case 1:
                water -= 250;
                beans -= 16;
                money += 4;
                break;
            case 2:
                water -= 350;
                milk -= 75;
                beans -= 20;
                money += 7;
                break;
            case 3:
                water -= 200;
                milk -= 100;
                beans -= 12;
                money += 6;
                break;
        }
        disposableCups--;
    }

    public static void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add: ");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        disposableCups += scanner.nextInt();
    }

    public static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
}
