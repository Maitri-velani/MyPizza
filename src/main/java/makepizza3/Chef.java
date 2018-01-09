package makepizza3;

public class Chef extends Person {
    //String order;
    Salt salt = new Salt();
    Water water = new Water();
    Flour floar = new Flour();
    Oil oil = new Oil();
    Sauce souce = new Sauce();

    /*Base b = new Base();
    Topping olive = new Topping();*/
    //olive.name = "Olive";

    private Dough makeDough(Salt salt, Flour floar, Oil oil, Water water)
    {

        Dough d =new Dough();
        d.salt=salt;
        d.flour=floar;
        d.oil=oil;
        d.water=water;

        System.out.println("Dough is ready");
        return d;
    }

    private Base makeBase(Dough dough)
    {
        Base base = new Base();
        base.setDough(dough);
        //base.dough = dough;
        System.out.println("Base is ready");
        return base;
    }

    private Base applySauce(Base base)
    {
        System.out.println("Sauce is applied");
        return base;
    }


    private BakedFood bake(Base base)
    {
        Oven oven = new Oven();
        oven.start();
        oven.setMinute(15);
        oven.setMinute();
        oven.setTemperature(90);
        oven.setTemperature();
        oven.put(base);
        oven.stop();

        Pizza pizza = (Pizza) oven.remove();
        return pizza;
    }

    public Pizza cook(PizzaStyle margherita)
    {
        floar.setName("Wheat");
        oil.setName("Soya Bean");
        salt.setType("White salt");
        water.setType("Warm water");

        Dough dough=makeDough(salt, floar,oil, water);

        Base base = makeBase(dough);
        base.setCrustType(margherita.getCrustType());
        base.setCrustSize(margherita.getCrustSize());
        base = applySauce(base);


        for(String element:margherita.getToppings())
        {
            Topping t = new Topping(element);
            base.applyTopping(t);
        }

        System.out.println(base);

        Pizza pizza1 = (Pizza) bake(base);
        System.out.println(pizza1 + " is ready. ");
        return pizza1;
    }
}
