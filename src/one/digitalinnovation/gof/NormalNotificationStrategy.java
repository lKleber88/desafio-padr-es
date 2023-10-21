package one.digitalinnovation.gof;

public class NormalNotificationStrategy implements NotificationStrategy {
    
	@Override
    public void notify(Robot robot, String message) {
        robot.notify("Notificação Normal: " + message);
    }
}
