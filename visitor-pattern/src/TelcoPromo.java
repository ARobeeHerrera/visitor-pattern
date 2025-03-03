
public class TelcoPromo {
    public static void main(String[] args) {
        //Initialize the data of telco by the telco name
        Telco telco = new Telco();

        TelcoAllowance promo = new TelcoAllowance();
        UnliCallTextPackage unli = new UnliCallTextPackage();

        //Smart
        telco.setTelcoName("Smart");
        System.out.println("Smart Data Usage Offer and price: " + telco.accept(promo, telco.getDataAllowance()));
        System.out.println("Smart unlimited calls and text package: " + telco.accept(unli, telco.getUnliCallText()));

        //Globe
        telco.setTelcoName("Globe");
        System.out.println("\nGlobe Data Usage Offer and price: " + telco.accept(promo, telco.getDataAllowance()));
        System.out.println("Globe unlimited calls and text package: " + telco.accept(unli, telco.getUnliCallText()));


        //Dito
        telco.setTelcoName("Dito");
        System.out.println("\nDito Data Usage Offer and price: " + telco.accept(promo, telco.getDataAllowance()));
        System.out.println("Dito unlimited calls and text package: " + telco.accept(unli, telco.getUnliCallText()));

        //Initialize the values of telco
        Telco smart = new Telco(15, 500.0, "Smart",false);
        Telco globe = new Telco(10, 450.0, "Globe",true);
        Telco dito = new Telco(8, 400.0, "Dito",true);

        TelcoAllowance promo1 = new TelcoAllowance();
        UnliCallTextPackage unli1 = new UnliCallTextPackage();

        //Smart
        System.out.println("\nSmart Data Usage Offer and price: " + smart.accept(promo1, smart.getDataAllowance()));
        System.out.println("Smart unlimited calls and text package: " + smart.accept(unli, smart.getUnliCallText()));

        //Globe
        System.out.println("\nGlobe Data Usage Offer and price" + globe.accept(promo1, globe.getDataAllowance()));
        System.out.println("Globe unlimited calls and text package: " + globe.accept(unli1, globe.getUnliCallText()));

        //Dito
        System.out.println("\nDito Data Usage Offer and price" + dito.accept(promo1, dito.getDataAllowance()));
        System.out.println("Dito unlimited calls and text package: " + dito.accept(unli1, dito.getUnliCallText()));

    }
}