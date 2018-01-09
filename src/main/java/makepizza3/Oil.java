package makepizza3;

public class Oil {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Oil{" +
                "name='" + name + '\'' +
                '}';
    }
}
