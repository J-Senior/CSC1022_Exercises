
public class Rational implements Comparable<Rational>{
    private int num;
    private int denom;

    public static void main(String[] args) throws Error {
        try {
        	Rational r1 = new Rational(1, 2); // 1/2
        	Rational r2 = new Rational(3, 4); // 3/4
        	Rational result = new Rational();
        	result = r1.add(r2);
        	System.out.println("Add: " + result);
        	result = r1.subtract(r2);
        	System.out.println("Subtract: " + result);
        	result = r1.multiply(r2);
        	System.out.println("Multiply: " + result);
        	result = r1.divide(r2);
        	System.out.println("Divide: " + result);
        	int compared = r1.compareTo(r2);
        	System.out.println("Compare: " + compared);
        	result = r1.simplify();
        	System.out.println("Simplify: " + result); //3/4
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
        Rational temp = new Rational(num * rhs.denom + rhs.num * denom, denom * rhs.denom);
        if (temp.num == 0)
            return temp;
        else
            return temp.simplify();
    }

    public Rational subtract(Rational rhs) throws Error {
        Rational temp = new Rational(num * rhs.denom - rhs.num * denom, denom * rhs.denom);
        if (temp.num == 0)
            return temp;
        else
            return temp.simplify();
    }

    public Rational multiply(Rational rhs) throws Error {
        Rational temp = new Rational(num * rhs.num, denom * rhs.denom);
        if (temp.num == 0)
            return temp;
        else
            return temp.simplify();
    }

    public Rational divide(Rational rhs) throws Error {
        Rational flip = new Rational(rhs.denom, rhs.num);
        Rational temp = new Rational(num * flip.num, denom * flip.denom);
        if (temp.num == 0)
            return temp;
        else
            return temp.simplify();
    }
    
    public int compareTo(Rational rhs) {
        return Double.compare(((double) this.num / (double) this.denom), ((double) rhs.num / (double) rhs.denom));
    }
    
    public Rational gcd(Rational rhs) throws Error {
    	
    	if (rhs.num > rhs.denom) {
    		return gcd(new Rational((rhs.num - rhs.denom), rhs.denom));
    	}
    	if (rhs.num < rhs.denom) {
    		return gcd(new Rational(rhs.num, (rhs.denom - rhs.num)));
    	}
    	else {
    		return rhs;
    	}
    }
    
    public Rational simplify() throws Error {
        Rational temp = new Rational(this.num, this.denom);
        if (temp.num == 0)
            return temp;
        if (temp.num < 0)
            temp.num = -temp.num;
        if (temp.denom < 0)
            temp.denom = -temp.denom;
        temp = gcd(temp);
        return new Rational(this.num / temp.num, this.denom / temp.denom);
    }

    public String toString() {
        return String.format(this.getNum() + "/" + this.getDenom());
    }
}
