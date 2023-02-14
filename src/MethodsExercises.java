import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(1, 2));
        System.out.println(subtraction(1, 2));
        System.out.println(multiplication(1, 2));
        System.out.println(division(1, 2));
        System.out.println(modulus(1, 2));
        System.out.println(getInteger(1, 10));
        System.out.println(factorial(3));
        System.out.println(rollDice(2));
    }

    public static int addition(int num1, int num2){
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }

    public static int division(int num1, int num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
        return num1 % num2;
    }


    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10.");
        int userInput = sc.nextInt();
        if(userInput >= min && userInput <= max){
            System.out.println("Your number is " + userInput);
        } else if(userInput < min || userInput > max) {
            System.out.println("Your number is not between 1 and 10.");
        } else{
            System.out.println("Your number is not a number.");
        }
        return userInput;
    }


        public static long factorial(int num){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 10: ");
            int userInput = sc.nextInt();
            if(userInput >= 1 && userInput <= 10){
                System.out.println("Your number is " + userInput + " Do you wish to continue? [y/n]");
                String yes = sc.next();
                boolean confirmation = yes.equals("y");
                if(confirmation){
                    long factorial = 1;
                    for(int i = 1; i <= userInput; i++){
                        factorial = factorial * i;
                    }
                    System.out.println("The factorial of " + userInput + " is " + factorial);
                } else {
                    return 0;
                }
            }
            return factorial(num);
        }
    public static int rollDice(int sides){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides for a pair of dice: ");
        int userInput = sc.nextInt();
        int dice1 = (int) (Math.random() * userInput) + 1;
        int dice2 = (int) (Math.random() * userInput) + 1;
        int sum = dice1 + dice2;
        System.out.println("Your dice are " + dice1 + " and " + dice2 + " for a total of " + sum + ". DO you want to roll again? [y/n]" );
        String yes = sc.next();
        boolean confirmation = yes.equals("y");
        if(confirmation){
            rollDice(sides);
        } else {
            return 0;
        }
        return sum;
    }

}
