package stringmanipulation;

public class StringToArray {
    public static void main(String[] args) {
        String originalString = "This is a String";
        char[] charArray = new char[originalString.length() + 1];
        int counter = 0;

        while(counter <= originalString.length() + 1){
            charArray[counter] = originalString.charAt(counter);
            counter = counter + 1;
        }

    }
}
