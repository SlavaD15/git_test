package Twenty_sixth;

import Twenty_sixth.loader.PierLoader;
import Twenty_sixth.loader.ShipGenerator;
import Twenty_sixth.ship.Ship;
import Twenty_sixth.ship.types.Type;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Tunnel tunnel = new Tunnel();

        ShipGenerator shipGenerator = new ShipGenerator(tunnel, 10);

        PierLoader pierLoader_bread = new PierLoader(tunnel, Type.BREAD);
        PierLoader pierLoader_banana = new PierLoader(tunnel, Type.BANANA);
        PierLoader pierLoader_dress = new PierLoader(tunnel, Type.DRESS);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        service.execute(shipGenerator);
        service.execute(pierLoader_bread);
        service.execute(pierLoader_banana);
        service.execute(pierLoader_dress);

        service.shutdown();
    }
}