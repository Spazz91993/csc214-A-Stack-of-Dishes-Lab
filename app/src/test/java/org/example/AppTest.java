package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    private DishStack stack;

    @BeforeEach
    public void setUp() {
        stack = new DishStack(3);
    }

    @Test
    public void testPushAndSize() {
        assertEquals(0, stack.size());
        
        stack.push(new Dish("Plate"));
        assertEquals(1, stack.size());
        
        stack.push(new Dish("Bowl"));
        assertEquals(2, stack.size());
    }

    @Test
    public void testPushBeyondCapacity() {
        stack.push(new Dish("Plate"));
        stack.push(new Dish("Bowl"));
        stack.push(new Dish("Cup"));
        
        assertEquals(3, stack.size());
        
        stack.push(new Dish("Saucer"));
        assertEquals(3, stack.size());
    }

    @Test
    public void testPop() {
        Dish plate = new Dish("Plate");
        Dish bowl = new Dish("Bowl");
        
        stack.push(plate);
        stack.push(bowl);

        Dish popped = stack.pop();
        assertEquals(bowl, popped);
        assertEquals(1, stack.size());

        popped = stack.pop();
        assertEquals(plate, popped);
        assertEquals(0, stack.size());
    }

    @Test
    public void testPopOnEmptyStack() {
        Dish popped = stack.pop();
        assertNull(popped);
    }

    @Test
    public void testPeek() {
        Dish plate = new Dish("Plate");
        stack.push(plate);

        Dish peeked = stack.peek();
        assertEquals(plate, peeked);
        assertEquals(1, stack.size());
    }

    @Test
    public void testPeekOnEmptyStack() {
        Dish peeked = stack.peek();
        assertNull(peeked);
    }
}

