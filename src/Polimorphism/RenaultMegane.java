package Polimorphism;

public class RenaultMegane extends AbstractCar{
    public RenaultMegane(int productionYear) {
        super(productionYear, "Renault", "Megane");
    }

    @Override
    public void inviteYourOwner() {
        System.out.println("Welcome in your Renault Megane");
    }
}
