import java.util.ArrayList;

public class test{

    ArrayList<Integer> al;
    ArrayList<Integer> oldAl;

    public test(){
        al = new ArrayList<>();
        oldAl = new ArrayList<>();
    }

    public static void main(String[] args) {
        test Test = new test();
        ArrayList<Integer> al = new ArrayList<>();
        al.addAll(Test.getAl());
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        Test.changeAl(al);
        Test.testMethod();

        ArrayList<Integer> all = new ArrayList<>();
        all.addAll(Test.getAl());
        all.add(6);
        all.add(7);
        all.add(8);
        all.add(9);
        all.add(10);
        Test.changeAl(all);
        Test.testMethod();
    }

    // Print out the uncommon between old & new
    public void testMethod(){
        ArrayList<Integer> newAl = new ArrayList<>();
        for(int i = 0; i < al.size(); i++){
            try{
            if(oldAl.get(i) != al.get(i)) newAl.add(al.get(i));
            } catch (IndexOutOfBoundsException ioof){
                newAl.add(al.get(i));
            }
        }

        System.out.println("OLD AL: ");
        oldAl.forEach(e -> System.out.print(e));
        System.out.println();

        System.out.println("AL: ");
        al.forEach(e -> System.out.print(e));
        System.out.println();

        System.out.println("NEW AL: ");
        newAl.forEach(e -> System.out.print(e));
        System.out.println();
    }

    public void changeAl(ArrayList<Integer> al){
        this.oldAl = this.al;
        this.al = al;
    }

    public ArrayList<Integer> getAl(){
        return al;
    }
}