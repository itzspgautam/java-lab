//Lab 5: Question 1
class OuterClass {
    private int a;

    OuterClass(int x) {
        a = x;
    }

    class InnerClass {
        void display() {
            System.out.println("a= " + a);
        }
    }
}
class Lab5_Q1 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(10);           
        OuterClass.InnerClass inner = outer.new InnerClass(); 
        inner.display();                               
    }
}
