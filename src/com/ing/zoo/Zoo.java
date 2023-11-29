package com.ing.zoo;


import java.util.*;

public class Zoo {
    public static void main(String[] args) {
        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Capybara biggerton = new Capybara("biggerton");

        // Adding all animals to an array, so I can iterate over them for group actions
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(henk);
        animals.add(elsa);
        animals.add(dora);
        animals.add(wally);
        animals.add(marty);
        animals.add(biggerton);

        // Here I use a Map for scalability and better code structure than a 1000 if else statements
        Map<String, List<Runnable>> commandMap = new HashMap<>();

        for (Animal animal : animals) {
            String helloCommand = "hello " + animal.getName();
            commandMap.put(helloCommand, new ArrayList<>(Collections.singletonList(animal::sayHello)));
        }


        List<Runnable> collectiveHello = new ArrayList<>();
        for (Animal animal : animals) {
            collectiveHello.add(animal::sayHello);
        }
        commandMap.put("hello", collectiveHello);

        // All animals that can perform a trick do so
        List<Runnable> collectiveTricks = new ArrayList<>();
        for (Animal animal : animals) {
            collectiveTricks.add(animal::performTrick);
        }
        commandMap.put("perform trick", collectiveTricks);

        // Group action for meat eaters
        List<Runnable> meatEatersActions = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof MeatEater) {
                meatEatersActions.add(((MeatEater) animal)::eatMeat);
            }
        }
        commandMap.put("give meat", meatEatersActions);

        // Group action for plant eaters
        List<Runnable> plantEatersActions = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof PlantEater) {
                plantEatersActions.add(((PlantEater) animal)::eatLeaves);
            }
        }
        commandMap.put("give leaves", plantEatersActions);

        Scanner scanner = new Scanner(System.in);

        String input;
        do {
            System.out.print("Voer uw command in (exit om te stoppen): ");

            input = scanner.nextLine();

            List<Runnable> actions = commandMap.get(input);
            if (actions != null && !actions.isEmpty()) {
                actions.forEach(Runnable::run);
            } else {
                System.out.printf("Unknown command: %s\n", input);
            }
            System.out.println();


        } while (!input.equals("exit"));

        System.out.println("Doeidoei");
    }
}
