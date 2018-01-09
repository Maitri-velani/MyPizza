package makepizza3;

public class Main {

    public static void main(String[] args)
    {
       Customer maitri = new Customer();
       maitri.setName("Maitri");
       Chef pratik = new Chef();
       pratik.setName("Pratik");

       maitri.putOrder(pratik);
    }
}