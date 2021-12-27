import java.util.ArrayList;
import java.util.List;

/**
 * recursive
 */
public class recursive {
    ArrayList<Integer> arrayList;

    public recursive(){
        arrayList = new ArrayList<>();
        for(int i = 1; i <= 50; i++){
            arrayList.add(i);
        }
    }

    public static void main(String[] args) {
        recursive r = new recursive();
        r.testMethod();
    }

    public void testMethod(){
        int num = getLast(arrayList);
        System.out.println(num);
        if(arrayList.size() > 1){
            arrayList.remove(arrayList.size() - 1);
            testMethod();
        }
    }

    public static <T> T getLast(List<T> list) {
        return list != null && !list.isEmpty() ? list.get(list.size() - 1) : null;
    }


}