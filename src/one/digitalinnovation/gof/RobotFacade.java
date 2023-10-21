package one.digitalinnovation.gof;

public class RobotFacade {
	private NormalNotificationStrategy normalStrategy = new NormalNotificationStrategy();
    private AggressiveNotificationStrategy aggressiveStrategy = new AggressiveNotificationStrategy();
    private DefensiveNotificationStrategy defensiveStrategy = new DefensiveNotificationStrategy();

    public Robot createRobot(String type) {
        return new Robot(type + " Robot");
    }

    public void notifyRobot(Robot robot, String message) {
        if (robot.getName().contains("normal")) {
            normalStrategy.notify(robot, message);
        } else if (robot.getName().contains("aggressive")) {
            aggressiveStrategy.notify(robot, message);
        } else if (robot.getName().contains("defensive")) {
            defensiveStrategy.notify(robot, message);
        }
    }

}
