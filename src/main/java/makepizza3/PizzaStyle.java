package makepizza3;

import java.util.ArrayList;
import java.util.List;

public class PizzaStyle {
    private String name;
    private String crustType;
    private String crustSize;
    //private String[] toppings;
    private List<String> toppings =new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "PizzaStyle{" +
                "name='" + name + '\'' +
                ", crustType='" + crustType + '\'' +
                ", crustSize='" + crustSize + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
