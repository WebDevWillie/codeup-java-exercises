package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
     String input = scanner.next();
     if(input.equalsIgnoreCase("y") ||input.equalsIgnoreCase("yes")){
         return true;
     } else {
         return false;
     }
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number between 1 and 10.");
        int userInput = scanner.nextInt();
        if(userInput >= min && userInput <= max){
            System.out.println("Your number is " + userInput);
        } else if(userInput < min || userInput > max) {
            System.out.println("Your number is not between min and max.");
        } else{
            System.out.println("Your number is not a number.");
        }
        return userInput;
    }

    public int getInt(){
        int userInput = scanner.nextInt();
        scanner.nextLine();
        return userInput;
    }

    public Double getDouble(double min, double max){
        Double userInput = scanner.nextDouble();
        if(userInput >= min && userInput <= max){
            System.out.println("Your number is " + userInput);
        } else if(userInput < min || userInput > max) {
            System.out.println("Your number is not between min and max.");
        } else{
            System.out.println("Your number is not a number.");
        }
        return userInput;
    }

    public Double getDouble(){
        return scanner.nextDouble();
    }
}
