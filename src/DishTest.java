public class DishTest {

    public static void main(String[] args) {
        Dish dish1 = new Dish(100, "pizza", true);
//        dish1.setCostInCents(100);
//        dish1.setNameOfDish("Pizza");
//        dish1.setWouldRecommend(true);

        dish1.printSummary();

        Dish dish2 = new Dish(1400, "pasta", true);
//        dish2.setCostInCents(1400);
//        dish2.setNameOfDish("Pasta");
//        dish2.setWouldRecommend(true);

        DishTools.analyzeDishCost(dish1);
        DishTools.shoutDishName(dish1);
        DishTools.flipRecommendation(dish1);
        dish2.printSummary();
    }


}
