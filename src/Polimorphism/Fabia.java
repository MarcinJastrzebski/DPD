package Polimorphism;

public class Fabia extends Skoda {
    public Fabia(int productionYear) {
        super(productionYear, "Fabia");
    }

    @Override
    public void inviteYourOwner() {
        System.out.println("Welcome in your Skoda Fabia");
    }
}
