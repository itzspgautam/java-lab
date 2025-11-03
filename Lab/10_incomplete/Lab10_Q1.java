interface Motor{
int capicity = 200;

void run();
void consume();
}

class WashingMachine implements Motor{

public void run(){
System.out.println("Washing machine is running.....");
}

public void consume(){
System.out.println("Washing machine consumes "+capicity+" watt of power.");
}

}

public class Lab10_Q1{
public static void main(String[] args){

WashingMachine wm = new WashingMachine();

wm.run();
wm.consume();

System.out.println("Motor capicity via Object of Washing Machine "+wm.capicity+".");
System.out.println("Motor capicity via Interface "+Motor.capicity+".");

}

}