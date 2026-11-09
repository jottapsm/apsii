package pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else if (item.equalsIgnoreCase("clam")) {
            pizza = new ClamPizza(ingredientFactory);
        }
        return pizza;
    }
}
