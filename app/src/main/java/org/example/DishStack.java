package org.example;

public class DishStack {
    private Dish[] stack;
    private int top;
    private int capacity;
  
    public DishStack(int capacity) {
        this.capacity = capacity;
        this.stack = new Dish[capacity];
        this.top = -1;
    }
  
    public void push(Dish dish) {
        if (top >= capacity - 1) {
            System.out.println("Stack is full. Cannot push " + dish.description);
            return;
        }
        stack[++top] = dish;
    }
  
    public Dish pop() {
        if (top < 0) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        return stack[top--];
    }
  
    public Dish peek() {
        if (top < 0) {
            System.out.println("Stack is empty. Nothing to peek.");
            return null;
        }
        return stack[top];
    }
  
    public int size() {
        return top + 1;
    }
  }
  