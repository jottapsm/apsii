package pizza;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Veggies[] veggies;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350.");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box.");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("--- ").append(name).append(" ---\n");
        if (dough != null) result.append(dough).append("\n");
        if (sauce != null) result.append(sauce).append("\n");
        if (cheese != null) result.append(cheese).append("\n");
        if (veggies != null) {
            for (Veggies veggie : veggies) result.append(veggie).append("\n");
        }
        if (pepperoni != null) result.append(pepperoni).append("\n");
        if (clam != null) result.append(clam).append("\n");
        return result.toString();
    }
}
