//TODO: Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 Student objects with at least 3 grades each, and add them to the map.
//
// TODO: Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a GitHub username (i.e. one of the keys in your map). If the given input does not match up with a key in your map, tell the user that no users with that username were found. If the given username does exist, display information about that student, including their name and their grades. After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.
package grades;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        students.put("JohnBoi", new Student("John Doe"));
        students.get("JohnBoi").addGrade(90);
        students.get("JohnBoi").addGrade(80);
        students.get("JohnBoi").addGrade(95);

        students.put("Janey", new Student("Jane Smith"));
        students.get("Janey").addGrade(85);
        students.get("Janey").addGrade(95);
        students.get("Janey").addGrade(90);

        students.put("Bobby", new Student("Bob Johnson"));
        students.get("Bobby").addGrade(70);
        students.get("Bobby").addGrade(75);
        students.get("Bobby").addGrade(80);

        students.put("Wonderland", new Student("Alice Lee"));
        students.get("Wonderland").addGrade(95);
        students.get("Wonderland").addGrade(90);
        students.get("Wonderland").addGrade(95);

        System.out.println(students);


        System.out.println("Welcome!\n");

        System.out.println("Here are the GitHub usernames of our students:");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println("\n\nWhich student would you like to see more information on?");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (students.containsKey(userInput)) {
            System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput);
            System.out.println("Current Average: " + students.get(userInput).getGradeAverage());
        } else {
            System.out.println("Sorry, no student found with the GitHub username of \"" + userInput + "\".");
        }
    }
}


