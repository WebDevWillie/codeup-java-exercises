/* TODO: create a class called Product with two private properties of name and priceInCents.
    Add a public static method called find average price that takes in an array of products
    and finds the average price of all products. Add a main method to the class to test some
    values.
 */


public class Product {

    private String name;
    private int priceInCents;

    public Product(String name, int priceInCents) {
        this.name = name;
        this.priceInCents = priceInCents;
    }

    public static double findAveragePrice(Product[] products) {
        double sum = 0;
        for (Product product : products) {
            sum += product.priceInCents;
        }
        return sum / products.length;
    }

    public static void main(String[] args){
        Product[] products = {
                new Product("Toilet Paper", 100),
                new Product("Tissues", 200),
                new Product("Paper Towels", 300)
        };

        System.out.println(findAveragePrice(products));
    }
}
