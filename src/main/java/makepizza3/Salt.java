package makepizza3;

public class Salt {
    private String type;

    @Override
    public String toString() {
        return "Salt{" +
                "type='" + getType() + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
