//Lab 5: Question 3
class Lab5_Q3 {
	//call by value
	static void callByValue(int x){
		x=x+10;
		System.out.println("Inside callByValue, x="+x);
	}
	//call by refrence
	static void callByRef(int[] arr){
		arr[0]=arr[0]+10;
		System.out.println("Inside callByRefrence, arr[0]=" +arr[0]);
	}
	public static void main(String[] args){
		int a=5;
		System.out.println("====Call by Value====");
		System.out.println("Value of a before callByValue: "+a);
		callByValue(a);
		System.out.println("Value of a after callByValue: "+a);

		System.out.println("====Call by Refrence====");
		int[] numbers = {5};
		System.out.println("Before Call by refrence: " +numbers[0]);
		callByRef(numbers);
		System.out.println("After Call by refrence: " +numbers[0]);

	}
}
