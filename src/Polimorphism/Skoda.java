package Polimorphism;

public class Skoda extends AbstractCar{

    public Skoda(int productionYear, String modelName) {
        super(productionYear, "Skoda", modelName);
    }

    @Override
    public void inviteYourOwner() {
        System.out.println("Welcome in your Skoda");
    }
}
