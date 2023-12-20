import java.time.Year;
import java.util.Scanner;

class QuickStart {
    public static void main (String[] args) {
        Scanner  myObj = new Scanner(System.in);
        System.out.println("Hello, User.");
        System.out.println("Would you like to:");
        System.out.println("1.Determine whether a number is even or odd.");
        System.out.println("2.find simple interest.");
        System.out.println("3.Find theArea of a circle.");
        System.out.println("4.take two numbers and print the largest.");
        System.out.println("5.check whether or not the year is a leap year.");
                
            

        int num = myObj.nextInt();

        switch (num) {
            case 1:
                System.out.print("Input number: ");
                int number = myObj.nextInt();
               if (number % 2 == 0) {
                     System.out.println(number + " is an even number.");
                 } else {
                     System.out.println(number + " is an odd number.");
                    }
                break;
            case 2:
                System.out.print("Enter the principal amount: ");
                double principal = myObj.nextDouble();

           
                System.out.print("Enter the rate of interest (in percentage): ");
                double rate = myObj.nextDouble();
                rate /= 100;


                System.out.print("Enter the time period (in years): ");
                double time = myObj.nextDouble();
                 double simpleInterest = (principal * rate * time);

                 System.out.println("Simple Interest: " + simpleInterest);
                break;
            case 3:
                System.out.println("Enter the radius of the circle: ");  
                double radius = myObj.nextDouble();  

                double area = Math.PI * Math.pow(radius, 2);
                System.out.println("Area of the circle: " + area);
                break;
            case 4:
                System.out.println("Enter first number:");    
                int firstNum = myObj.nextInt();

                System.out.println("Enter second number:");    
                int secondNum = myObj.nextInt();

               int largest = (firstNum > secondNum) ? firstNum: secondNum;
               System.out.println("The largest number is: " + largest);
                break;
                case 5:
                    int currentYear = Year.now().getValue();
                    boolean isLeapYear = (currentYear % 4 == 0 && currentYear % 100 != 0) || (currentYear % 400 == 0);

                     if (isLeapYear) {
                        System.out.println(currentYear + " is a leap year.");
                    } else {
                        System.out.println(currentYear + " is not a leap year.");
                    }  
                    
         
            default:
                break;
        }

        
    }
}


// 1.write a program to print whether a number is even or odd
// 2.write a program to take princial, time rate and find the simple interest
// 3.Area of circle.
// 4.take two numbers and print the largest
// 5.check whether or not the year is a leap year