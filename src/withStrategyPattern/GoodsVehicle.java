package withStrategyPattern;

import withStrategyPattern.Strategy.DriveStrategy;
import withStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
