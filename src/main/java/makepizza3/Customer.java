package makepizza3;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person
{
    private List<String > toppings = new ArrayList<>();


    public Pizza putOrder(Chef chef)
    {
        PizzaStyle margherita = new PizzaStyle();
        Customer maitri = new Customer();
        margherita.setCrustSize("Small");
        margherita.setCrustType("Wheat thin crust");
        margherita.setName("Margherita");

        toppings.add("Cheese");
        toppings.add("Onion");
        toppings.add("Olive");
        toppings.add("Pepperoni");

        margherita.setToppings(toppings);

        System.out.println(getName()+" is order to chef "+chef.getName() + " to make "+ margherita);

        Pizza pizza=chef.cook(margherita);

        return pizza;

    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "toppings=" + toppings +
                '}';
    }
}
