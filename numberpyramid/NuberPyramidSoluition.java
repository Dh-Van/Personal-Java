package numberpyramid;
/**
 * Nuber Pyramid Soluition (no for loops)
 */
public class NuberPyramidSoluition {
    


    public static void main(String[] args) {
        int outerCounter = 1;
        int innerCounter = 0;
        int displayNumber = 1;

        while(outerCounter <= 9){
            while(innerCounter < displayNumber){
                System.out.print(displayNumber);
                innerCounter = innerCounter + 1;
            }
            
            System.out.println("");
            innerCounter = 0;
            outerCounter = outerCounter + 1;
            displayNumber = displayNumber + 1;
        }
    }
    
}