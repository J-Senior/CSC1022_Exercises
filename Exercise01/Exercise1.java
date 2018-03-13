
public class Exercise1 {

    public static void main(String[] args) throws Error{
        try {
            int[] theArray = {1, 5, 10, -5};
            int result = Exercise1.min(theArray);
            System.out.print(result);
        } catch (Error a) {
            System.out.print(a);
        }

    }

    public static int min(int[] array) throws Error {
        
        if ( array.length == 0) {
            throw new Error("Array cannot be empty");
        }
        
        int min = array[0];
        
        for ( int i = 1; i < array.length; i++ ) {
            if ( array[i] < min ) {
                min = array[i];
            }
        }
        
        return min;
    }
}