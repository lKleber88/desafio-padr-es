package one.digitalinnovation.gof;

public class DefensiveNotificationStrategy implements NotificationStrategy {
    @Override
    public void notify(Robot robot, String message) {
        robot.notify("Notificação Defensiva: " + message);
    }
}
