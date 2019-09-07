public class ShipGenerator implements Runnable {

    private Tunnel tunnel;
    private int shipCount;

    public ShipGenerator(Tunnel tunnel, int shipCount){
        this.tunnel=tunnel;
        this.shipCount=shipCount;
    }
    public void run(){
        int count=0;
        while(count<shipCount){
            Thread.currentThread().setName("Generation ship");
            count++;
            tunnel.add(new Ship());
            tunnel.get();
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
