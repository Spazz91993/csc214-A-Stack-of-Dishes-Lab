
package org.example;

public class App {
    public static void main(String[] args) {
        DishStack dishStack = new DishStack(3);

        dishStack.push(new Dish("Plate"));
        dishStack.push(new Dish("Bowl"));
        dishStack.push(new Dish("Cup"));

        System.out.println("Current size: " + dishStack.size());

        Dish topDish = dishStack.peek();
        if (topDish != null) {
            System.out.println("Top dish: " + topDish.description);
        }

        dishStack.push(new Dish("Saucer"));

        Dish poppedDish = dishStack.pop();
        if (poppedDish != null) {
            System.out.println("Popped dish: " + poppedDish.description);
        }

        System.out.println("Size after pop: " + dishStack.size());
    }
}
