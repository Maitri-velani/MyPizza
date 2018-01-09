package makepizza3;

public class Person {
   private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
