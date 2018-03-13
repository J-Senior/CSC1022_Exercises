import java.util.Comparator;

public class NumComparator implements Comparator<Rational>{

    @Override
    public int compare(Rational lhs, Rational rhs) {
        if (lhs.getNum() > rhs.getNum())
            return 1;
        if (lhs.getNum() < rhs.getNum())
            return -1;
        return 0;
    }
}
