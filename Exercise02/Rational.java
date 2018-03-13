
public class Rational {
    private int num;
    private int denom;

    public static void main(String[] args) throws Error {
        try {
        	Rational r1 = new Rational(1, 2); // 1/2
        	Rational r2 = new Rational(3, 4); // 3/4
        	Rational result = new Rational();
        	result = r1.add(r2);
        	System.out.println(result);
        	result = r1.subtract(r2);
        	System.out.println(result);
        	result = r1.multiply(r2);
        	System.out.println(result);
        	result = r1.divide(r2);
        	System.out.println(result);
    	} catch (Error a) {
    		System.out.print(a);
    	}
    }
    
    public Rational() {
        this.num = 0;
        this.denom = 1;
    }

    public Rational(int num, int denom) throws Error{
    	if (denom == 0) {
            throw new Error("Cannot divide by zero");
        } if (denom < 0) {
        	num = -1 * num;
        	denom = -1 * denom;
        }
    	this.num = num;
        this.denom = denom;
    }

    int getNum() {
        return this.num;
    }

    int getDenom() {
        return this.denom;
    }

    public Rational add(Rational rhs) throws Error {
        return new Rational(num * rhs.denom + rhs.num * denom, denom * rhs.denom);
    }

    public Rational subtract(Rational rhs) throws Error {
        return new Rational(num * rhs.denom - rhs.num * denom, denom * rhs.denom);
    }

    public Rational multiply(Rational rhs) throws Error {
        return new Rational(num * rhs.num, denom * rhs.denom);
    }

    public Rational divide(Rational rhs) throws Error {
        Rational flip = new Rational(rhs.denom, rhs.num);
        return new Rational(num * flip.num, denom * flip.denom);
    }

    public String toString() {
        return String.format(this.getNum() + "/" + this.getDenom());
    }
}
