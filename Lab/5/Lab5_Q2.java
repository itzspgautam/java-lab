//Lab 5: Question 2
class OuterClass {
    private int a;

    OuterClass(int x) {
        a = x;
    }
    static class InnerClass {
        void display(OuterClass obj) {
            System.out.println("a= " + obj.a);
        }
    }
}
class Lab5_Q2 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(10);  
        OuterClass.InnerClass inner = new OuterClass.InnerClass(); 
        inner.display(outer);                  
    }
}
