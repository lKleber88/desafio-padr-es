package one.digitalinnovation.gof;

public class NotificationSystem {

	public static void main(String[] args) {
		RobotFacade robotFacade = new RobotFacade();

        Robot normalRobot = robotFacade.createRobot("normal");
        Robot aggressiveRobot = robotFacade.createRobot("aggressive");
        Robot defensiveRobot = robotFacade.createRobot("defensive");

        robotFacade.notifyRobot(normalRobot, "Mensagem importante para o robô normal.");
        robotFacade.notifyRobot(aggressiveRobot, "Cuidado, robô agressivo à vista!");
        robotFacade.notifyRobot(defensiveRobot, "Robô defensivo em ação.");

	}

}
