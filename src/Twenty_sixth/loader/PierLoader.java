package Twenty_sixth.loader;

import Twenty_sixth.Tunnel;
import Twenty_sixth.ship.Ship;
import Twenty_sixth.ship.types.Type;

public class PierLoader implements Runnable{
    private Tunnel tunnel;
    private Type type;

    public PierLoader(Tunnel tunnel, Type type) {
        this.tunnel = tunnel;
        this.type = type;
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.currentThread().setName("Loader" + type);
                Thread.sleep(500);
                Ship ship = tunnel.get(type);
                if(ship != null){
                    Thread.sleep(100);
                    ship.add(10);
                    System.out.println(ship.getCount() + " Loader ship. "
                            + Thread.currentThread().getName());
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
