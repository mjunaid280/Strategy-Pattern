package withoutStrategyPattern;

public class GoodsVehicle extends Vehicle{

    // Same as sports vehicle
    @Override
    public void drive() {
        System.out.println("Special Drive cap");
    }
}
