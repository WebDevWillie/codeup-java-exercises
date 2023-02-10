import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        System.out.println("Ask Bob if he wants to have a conversation");
        Scanner sc = new Scanner(System.in);
        boolean conversation = true;
        while(conversation == true) {
            String userInput = sc.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            } if(userInput.equals("bye")){
                conversation = false;
            }


        }
    }
}
