package makepizza3;

public class Water {
    private String type;

    @Override
    public String toString() {
        return "Water{" +
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
