package makepizza3;

public class Oven {

    private BakedFood bakedFood;
    private int minute;
    private float temperature;

    void start()
    {
        System.out.println("Oven Start");
    }

    int setMinute()
    {
        System.out.println("Minute is " + getMinute());
        return getMinute();
    }

    float setTemperature()
    {
        System.out.println("Temperature " + getTemperature());
        return getTemperature();
    }

    void put(Bakable bakable)
    {
        System.out.println("Base puted in oven");
        setBakedFood(bakable.bake());
    }

    void stop()

    {
        System.out.println("Oven Stop");
    }

    BakedFood remove()
    {
        System.out.println("Baked food is removed");
        //System.out.println("Baked food = "+bakedFood);

        return getBakedFood();
    }

    public BakedFood getBakedFood() {
        return bakedFood;
    }

    public void setBakedFood(BakedFood bakedFood) {
        this.bakedFood = bakedFood;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
}
