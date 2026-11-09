package pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("=== New York ===");
        nyStore.orderPizza("cheese");
        nyStore.orderPizza("clam");

        System.out.println("=== Chicago ===");
        chicagoStore.orderPizza("cheese");
        chicagoStore.orderPizza("clam");
    }
}
