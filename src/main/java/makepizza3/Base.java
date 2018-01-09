package makepizza3;


import java.util.ArrayList;
import java.util.List;

public class Base implements Bakable {
    private Dough dough;
    private String crustType,crustSize;
    private List<Topping> toppings = new ArrayList<>();

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getCrustType() {
        return crustType;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    public String getCrustSize() {
        return crustSize;
    }

    public void setCrustSize(String crustSize) {
        this.crustSize = crustSize;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }


    @Override
    public BakedFood bake() {
        Pizza margreta = new Pizza();
        margreta.setName("Margreta pizza");
        margreta.setBase(this);
        return margreta;

    }

    public void applyTopping(Topping topping)
    {
        toppings.add(topping);
        setToppings(toppings);
    }

    @Override
    public String toString() {
        return "Base{" +
                "dough=" + dough +
                ", crustType='" + crustType + '\'' +
                ", crustSize='" + crustSize + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
