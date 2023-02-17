public class ServerNameGenerator {

    public static String[] adjectives = {"big", "small", "tall", "short", "long", "round", "square", "fat", "skinny", "red"};
    public static String[] nouns = {"house", "car", "tree", "dog", "cat", "bird", "fish", "computer", "phone", "book"};

    public static String randomElement(String[] array) {
        int randomIndex = (int) (Math.random() * array.length);
        return array[randomIndex];
    }

    public static String makeServerName(String[] adjectives, String[] nouns) {
        return "Your server name is: " + randomElement(adjectives) + "-" + randomElement(nouns);
    }

    public static void main(String[] args) {
        System.out.println(makeServerName(adjectives, nouns));
    }
}
