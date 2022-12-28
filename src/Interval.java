public interface Interval {
    int getSmallestElem();
    int getLargestElem();
    Interval intersect(Interval r);
}