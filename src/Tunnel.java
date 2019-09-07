import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tunnel {

    List<Ship> store;
    private static final int min=0;
    private static final int max=5;
    private int shipCouter=0;
    private int shipConterAll=0;

    public Tunnel(){
        store=new ArrayList<>();
    }


    public synchronized void add(Ship element){
        try {
            if (shipCouter < max) {
                notifyAll();
                store.add(element);
                System.out.println("Ship arrived in tunnel ");
                shipCouter+=4;
                shipConterAll+=4;
                System.out.println("All produce ship is: "+ shipConterAll + "ost: "+ store.size());
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            } else {
                System.out.println("Ship didnt arrive in tunnel");
                wait();
            }
        }catch(InterruptedException e){
            System.out.println("error");
        }
    }

    public synchronized void get(){
        try {
        if(shipCouter>min){
            notifyAll();
            store.remove(0);
            shipCouter--;
            System.out.println("Ship is taken from the tunnel");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
//            Iterator<Ship> it=store.iterator();
//            while(it.hasNext()){
//                    it.remove();
//                System.out.println();
//            }
        }
        else{
                wait();
            }
        }catch (InterruptedException e){
            System.out.println("error");
        }
    }
}
