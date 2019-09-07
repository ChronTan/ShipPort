import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Ship ship=new Ship();
        Tunnel tunnel=new Tunnel();
        ShipGenerator shipGenerator=new ShipGenerator(tunnel,10);
        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        service.execute(shipGenerator);
        service.shutdown();
    }
}
