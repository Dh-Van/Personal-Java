package multiplicationtable;
public class MultiplicationTableSolution {
    public static void main(String[] args) {
        int tableOf = 4;
        int limit = 10;
        int counter = 1;

        while(counter <= limit){
            System.out.println(tableOf * counter);
            counter = counter + 1;
        }
    }
}
