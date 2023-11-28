package com.ing.zoo;

// Use interface Animal for methods shared across all animals
public interface Animal {
    void sayHello();

     default void performTrick()  {}

    /**
     * provides name and type of animal to each action
     * @param name
     * @param text
     */
    default void printText(String name, String text) {
        System.out.printf("%s the %s: %s\n", name, getClass().getSimpleName().toLowerCase(), text);
    }

}
