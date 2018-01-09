package makepizza3;

public class Topping extends Food {

    private String name;

    public Topping(String element) {

        System.out.println(element + " is added");
        setName(element);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Topping topping = (Topping) o;

        return name != null ? name.equals(topping.name) : topping.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
