import java.util.Arrays;

class Stack {
    int[] items;
    int size;
    int n;

    public Stack(int capacity) {
        this.n = capacity;
        this.items = new int[capacity];
        this.size = 0;
    }

    public void push(int item) {
        if (size == n) {
            System.out.println("Stack Overflow!");
        }
        items[size++] = item;
    }

    public int pop() {
        if (size == 0) {
            System.out.println("Stack Underflow!");
        }
        return items[--size];
    }

    public void stackView() {
        System.out.println("Stack contents : "+Arrays.toString(items));
    }

    public int peek() {
        if (size == 0) {
            System.out.println("Stack empty!");
        }
        return items[size-1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == n;
    }
}

public class Day2_4 {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(5);
        s.push(3);
        s.push(4);
        s.stackView();
        s.push(112);
        s.stackView();
        if(s.isFull())
            System.out.println("Stack full!");
        else
            System.out.println("Stack not full");
    }
}