import static java.lang.Math.max;
import static java.lang.Math.min;

public class BoundaryInterval implements Interval{
    int leftBoundary;
    int rightBoundary;
    public BoundaryInterval(int lb, int rb){
        leftBoundary = lb;
        rightBoundary = rb;
    }
    public int getSmallestElement(){
        return leftBoundary;

    }
    public int getLargestElement(){
        return rightBoundary;
    }

    @Override
    public int getSmallestElem() {
        return 0;
    }

    @Override
    public int getLargestElem() {
        return 0;
    }

    public Interval intersect(Interval r){
        if(max(leftBoundary, r.getSmallestElem()) <= min(rightBoundary, r.getLargestElem())){
            return new BoundaryInterval(
                    max(leftBoundary, r.getSmallestElem()),
                    min(rightBoundary, r.getLargestElem()));

        }else return null;

    }
}

