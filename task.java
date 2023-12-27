// Import necessary classes
import java.time.Year;
import java.util.Scanner;

// Main class named QuickStart
class QuickStart {
    // Function to determine whether a number is even or odd
    private static void checkEvenOrOdd(Scanner myObj) {
        System.out.print("Input number: ");
                int number = myObj.nextInt();
                if (number % 2 == 0) {
                    System.out.println(number + " is an even number.");
                } else {
                    System.out.println(number + " is an odd number.");
                }
                
    }
     // Function to calculate simple interest
    private static void calculateSimpleInterest(Scanner myObj) {
        System.out.print("Enter the principal amount: ");
                double principal = myObj.nextDouble();

                System.out.print("Enter the rate of interest (in percentage): ");
                double rate = myObj.nextDouble();
                rate /= 100;

                System.out.print("Enter the time period (in years): ");
                double time = myObj.nextDouble();
                double simpleInterest = (principal * rate * time);

                System.out.println("Simple Interest: " + simpleInterest);
    }
        // Function to find the area of a circle
    private static void calculateCircleArea(Scanner myObj) {
        System.out.println("Enter the radius of the circle: ");
                double radius = myObj.nextDouble();
                double area = Math.PI * Math.pow(radius, 2);
                System.out.println("Area of the circle: " + area);
    }
    // Function to take two numbers and print the largest
    private static void findLargestNumber(Scanner myObj) {
        System.out.println("Enter first number:");
                int firstNum = myObj.nextInt();

                System.out.println("Enter second number:");
                int secondNum = myObj.nextInt();

                int largest = (firstNum > secondNum) ? firstNum : secondNum;
                System.out.println("The largest number is: " + largest);
    }
        // Function to check whether or not the year is a leap year
    private static void checkLeapYear() {
        int currentYear = Year.now().getValue();
                boolean isLeapYear = (currentYear % 4 == 0 && currentYear % 100 != 0) || (currentYear % 400 == 0);

                if (isLeapYear) {
                    System.out.println(currentYear + " is a leap year.");
                } else {
                    System.out.println(currentYear + " is not a leap year.");
                }
    }

    public static void main (String[] args) {
        // Create a Scanner object to read input from the user
        Scanner myObj = new Scanner(System.in);

        boolean running = true;
        // Display a welcome message and options for the user
        while (running) {
             System.out.println("Hello, User.");
        System.out.println("Would you like to:");
        System.out.println("1. Determine whether a number is even or odd.");
        System.out.println("2. Find simple interest.");
        System.out.println("3. Find the area of a circle.");
        System.out.println("4. Take two numbers and print the largest.");
        System.out.println("5. Check whether or not the year is a leap year.");
        System.out.println("6. Exit");

        // Read the user's choice
        int num = myObj.nextInt();

        // Use a switch statement to perform the selected operation
        switch (num) {
            // Case 1: Determine whether a number is even or odd
            case 1:
                checkEvenOrOdd(myObj);
               
                break;

            // Case 2: Find simple interest
            case 2:
                calculateSimpleInterest(myObj);
                
                break;

            // Case 3: Find the area of a circle
            case 3:
                calculateCircleArea(myObj);
                break;

            // Case 4: Take two numbers and print the largest
            case 4:
                findLargestNumber(myObj);
                break;

            // Case 5: Check whether or not the year is a leap year
            case 5:
                checkLeapYear();
                break;
            
            case 6: 
                running = false;
                break;
            

            // Default case: Do nothing
            default:
                break;
        }
        }
       
    }
}
