//Lab 4: Question 6
class Counter {

    static int count = 0;
    Counter() {
        count++;  // increase count whenever an object is created
    }
    
    static void showCount() {
        System.out.println("Total objects created: " + count);
    }
}

public class Lab4_Q6 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter.showCount(); 
    }
}
