import static java.lang.Math.max;
import static java.lang.Math.min;

/** an integer interval represented by an array */
public class ArrayInterval implements Interval {
    private int[] boundary;

    public ArrayInterval(int[] boundary) {
        this.boundary = new int[]{boundary[0], boundary[1]};
    }

    public int smallestElem(){ return boundary[0]; }
    public int largestElem() { return boundary[1]; }

    @Override
    public int getSmallestElem() {
        return 0;
    }

    @Override
    public int getLargestElem() {
        return 0;
    }

    public Interval intersect(Interval r) {
        if(max(boundary[0],r.getSmallestElem()) <= min(boundary[1], r.getLargestElem())){
            return new ArrayInterval(new int[]{
                    max(boundary[0], r.getSmallestElem()),
                    min(boundary[1], r.getLargestElem())});
        }else return null;

    }  // works for any interval type ↑
}