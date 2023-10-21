package one.digitalinnovation.gof;

public class AggressiveNotificationStrategy implements NotificationStrategy {
    @Override
    public void notify(Robot robot, String message) {
        robot.notify("Notificação Agressiva: " + message);
    }
}
