import java.util.ArrayList;

/**
 * Duplicates
 */
public class Duplicates {

    ArrayList<Integer> arrayList;

    public Duplicates(){
        arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
    }

    public static void main(String[] args) {
        Duplicates duplicates = new Duplicates();
        duplicates.removeDuplicates();
    }

    public void removeDuplicates(){
        boolean isRemoved = false;
        int i = 0;

        System.out.println("OLD LIST: ");
        arrayList.forEach(e -> System.out.print(e));
        System.out.println("\n");

        while(!isRemoved){
            if(arrayList.get(i).equals(arrayList.get(i+1))){
                arrayList.remove(i+1);
            } else {
                i++;
            }

            if(i == arrayList.size() - 1) isRemoved = true;
        }


        System.out.println("NEW LIST: ");
        arrayList.forEach(e -> System.out.print(e));
        System.out.println("\n");
    }
}