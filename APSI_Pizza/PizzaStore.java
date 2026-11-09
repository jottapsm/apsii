package pizza;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        if (pizza == null) {
            System.out.println("Sorry, we don't have that pizza.");
            return null;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("We finished your " + pizza.getName() + "!\n");
        return pizza;
    }
}
