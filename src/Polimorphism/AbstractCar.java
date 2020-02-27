package Polimorphism;

public abstract class AbstractCar implements Car{
    private int productionYear;
    private String brandName;
    private String modelName;

    public AbstractCar(int productionYear, String brandName, String modelName) {
        this.productionYear = productionYear;
        this.brandName = brandName;
        this.modelName = modelName;
    }

    @Override
    public void startTheEngine() {
        System.out.println("I've started the engine");

    }

    @Override
    public void turnOffTheEngine() {
        System.out.println("I've turned the engine off");
    }

    @Override
    public void inviteYourOwner() {
        System.out.println("Hello User");
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getBrandName() {
        return brandName;
    }

    @Override
    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public String toString() {
        return "AbstractCar{" +
                "productionYear=" + productionYear +
                ", brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
