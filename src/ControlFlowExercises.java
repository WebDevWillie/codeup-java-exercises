import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args){

//        long i = 2;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }
//        for(int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }

//        for(int z = 0; z <= 100; z+=2){
//            System.out.println(z);
//        }


//        for(int x = 100; x >= -10; x-=5){
//            System.out.println(x);
//        }
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        for(long c = 2; c < 1000000; c*=c){
//            System.out.println(c);
//        }

//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

        for(int i=1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizz Buzz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }

//       TODO: Display a table of powers. Prompt the user to enter an integer. Display a table of squares and cubes from 1 to the value entered. Ask if the user wants to continue. Assume that the user will enter valid data. Only continue if the user agrees to.

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int userInput = sc.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for(int i = 1; i <= userInput; i++){
//            System.out.printf("%-6d | %-7d | %-5d%n", i, i * i, i * i * i);
//        }


//        System.out.println("Enter a grade from 0 - 100: ");
//        int grade = sc.nextInt();
//        System.out.print("The grade you entered is: " + grade + " Continue? [y/N] ");
//        String userInput = sc.next();
//        boolean confirmation = userInput.equals("y");
//        if(confirmation){
//            if(grade >= 88){
//                System.out.println("Your grade is an A!");
//            } else if(grade >= 80){
//                System.out.println("Your grade is a B");
//            } else if(grade >= 67){4
//                System.out.println("Your grade is a C :(");
//            } else if(grade >= 60){
//                System.out.println("Your grade is a D :(");
//            } else {
//                System.out.println("Your grade is an F :`(");
//            }
//        } else {
//            System.out.println("Goodbye");
//        }

        System.out.println("How are you doing today, fuck-wad?");
        String userInput = sc.next();
        if(userInput.equalsIgnoreCase("good") || userInput.equalsIgnoreCase("great") || userInput.equalsIgnoreCase("awesome") || userInput.equalsIgnoreCase("fantastic")){
            System.out.println("That's great! I'm glad you're doing well....");
        } else if(userInput.equalsIgnoreCase("bad") || userInput.equalsIgnoreCase("terrible") || userInput.equalsIgnoreCase("not good") || userInput.equalsIgnoreCase("awful")){
            System.out.println("I'm sorry to hear that. I hope you feel better soon... could I make you feel better with a Yo Momma Joke? Continue? [y/N]");
            String hndyInput = sc.next();
            boolean confirmation = hndyInput.equals("y");
            if(confirmation){
                System.out.println("Yo momma is fat and dumb... she tears apart computers looking for the cookies.");
            } else {
                System.out.println("Fine then! Get outa here Nerd!");
            }

        } else {
            System.out.println("I don't understand your response. Please try again.");
        }







    }

}
