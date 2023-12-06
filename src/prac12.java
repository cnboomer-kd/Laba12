import java.util.Scanner;

public class prac12 {

        public void prac12() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
    }

public class ThrowsDemo {
    public void getDetails(String key) {
        if(key == null) {
            throw newNullPointerException("null key in getDetails" );
        }
        // do something with the key
    }
}
