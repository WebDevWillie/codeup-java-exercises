import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
//        double pi = 3.14159;
//        String message = String.valueOf(System.out.format("The value of pi is approximately %.2f.%n", pi));
//        System.out.format(message);
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter three words");
//
//        String word1 = sc.nextLine();
//        String word2 = sc.nextLine();
//        String word3 = sc.nextLine();
//
//        System.out.print(word1 + "\n" + word2 + "\n" + word3);


//
        System.out.println("Enter the width: ");
        int width = sc.nextInt();
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        int area = width * length;
        int perimeter = (2 * width) + (2 * length);
        System.out.printf("The area is: %d %n", area );

        System.out.printf("The perimeter is: %d", perimeter);
    }


}
