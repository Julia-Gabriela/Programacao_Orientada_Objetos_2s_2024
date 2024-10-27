package Lista2.TrafficLight;
public class TrafficLightTest {
    public static void main(String[] args) {
        System.out.println("Duracoes das luzes do semaforo:");
        
        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%s: %d segundos%n", light, light.getDuration());
        }
    }
}

