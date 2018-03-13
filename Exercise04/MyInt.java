
public class MyInt implements Comparable<MyInt>{
    
    private int value;
    
    MyInt(int x) {
        value = x;
    }
    
    public int intValue() {
        return value;
    }
    
    public int compareTo(MyInt rhs) {
        return Integer.compare(this.value, rhs.intValue());
    }

    public String toString(MyInt i1) {
        return String.format("%d", value);
    }
}
