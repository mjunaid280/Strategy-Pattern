package withStrategyPattern;

import withStrategyPattern.Strategy.DriveStrategy;
import withStrategyPattern.Strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
