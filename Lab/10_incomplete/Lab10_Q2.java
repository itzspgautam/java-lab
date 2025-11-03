import java.util.Random;

abstract class Compartment{
abstract void notice();
}

class FirstClass  extends Compartment{
void notice(){
System.out.println("This is first class compartment.");
}
}

class Ladies  extends Compartment{
void notice(){
System.out.println("This is Ladies compartment.");
}
}

class General extends Compartment{
void notice(){
System.out.println("This is general compartment.");
}
}
class Lagguage extends Compartment{
void notice(){
System.out.println("This is lagguage compartment.");
}
}


public class Lab10_Q2{
public static void main(String[] args){
Compartment[] com = new Compartment[10];
Random rand = new Random();

for(int i=0; i< com.length; i++){
	int type = rand.nextInt(4)+1;

switch(type){
case 1: com[i] = new FirstClass();
	break;
case 2: com[i] = new Ladies();
	break;
case 3: com[i] = new General();
	break;
case 4: com[i] = new Lagguage();
	break;
}

}

for(int i=0; i< com.length; i++){
System.out.println("Compartment " + (i+1) + ": ");
com[i].notice();
}

}

}