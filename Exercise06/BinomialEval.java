
public class BinomialEval {

    public static void main(String[] args) throws Error {
        try {
        	int n = 8;
        	int k = 6;
        	System.out.println(c(n, k));
        } catch (Error a) {
        	System.out.print(a);
        }
    }

    public static int c(int n, int k) throws Error{
        
    	if ((n < 0) || (k < 0)) {
    		throw new Error("Cannot evaluate a negative integer");
    	}
        if (k == 0) {
            return 1;
        }
        
        if (k == n) {
            return 1;
        }
        
        if (k > n) {
            return 0;
        }
        
        else {
            return c(n-1, k-1) + c(n-1, k);
        }
    }
}
