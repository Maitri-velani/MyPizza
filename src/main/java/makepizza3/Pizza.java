package makepizza3;

public class Pizza extends Food implements BakedFood {
   private Base base;

    @Override
    public String toString() {
        return "Pizza{" +
                "base=" + base +
                '}';
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }
}
