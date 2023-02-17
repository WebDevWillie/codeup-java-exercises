
public class Arrays {

    public static double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};

    public static double sum() {
        double sum = 0;
        for (double number : numbers) {
            sum += number;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum());
    }



}
