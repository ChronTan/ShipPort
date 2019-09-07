import java.util.ArrayList;
import java.util.Iterator;

public class Test {


    public static void main(String[] args) {
        Test test=new Test();
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> getArr=new ArrayList<>();
        for(int i=0;i<8;i++){
            arr.add(i);
        }
        Iterator<Integer> it=arr.iterator();
        while(it.hasNext()){
            if(it.next()==2){
                it.remove();
                getArr.add(it.next()-1);
            }
        }
        System.out.println(arr);
        System.out.println(getArr);

    }

}
