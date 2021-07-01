public class StringToArray {
    public static void main(String[] args) {
        String originalString = "This is a String";
        String[] stringArray = new String[originalString.length() + 1];
        int counter = 0;

        while(counter <= originalString.length() + 1){
            stringArray[counter] = originalString.indexOf(counter);
            counter = counter + 1;
        }

    }
}
