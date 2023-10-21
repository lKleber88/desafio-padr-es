package one.digitalinnovation.gof;

public class Robot {
	private String name;

    public Robot(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void notify(String message) {
        System.out.println(name + " recebeu a mensagem: " + message);
    }
}
