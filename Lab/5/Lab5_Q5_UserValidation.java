//Lab 5: Question 5
public class Lab5_Q5_UserValidation{
    // Method to validate name - checks if it contains alphabets only
    public boolean validate(String name) {
        // Regex to check if the string contains only alphabets (both uppercase and lowercase)
        if (name != null && name.matches("[a-zA-Z]+")) {
            System.out.println("Name is valid.");
            return true;
        } else {
            System.out.println("Invalid name! Name should contain alphabets only.");
            return false;
        }
    }
    // Overloaded method to validate age - checks if age is between 3 and 15
    public boolean validate(int age) {
        if (age > 3 && age < 15) {
            System.out.println("Age is valid.");
            return true;
        } else {
            System.out.println("Invalid age! Age should be greater than 3 and less than 15.");
            return false;
        }
    }
    public static void main(String[] args) {
        Lab5_Q5_UserValidation uv = new Lab5_Q5_UserValidation();
        uv.validate("Suraj");     // Valid name
        uv.validate("gautam7877");  // Invalid name
        uv.validate(10);         // Valid age
        uv.validate(2);          // Invalid age
    }
}