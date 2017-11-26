package Sorts;

import Interfaces.Numerical;

import java.util.Comparator;

public class LSDSort<T extends Numerical<T>> extends AbstractSortOnComparisons<T> {

    LSDSort(){
       super();
    }

    LSDSort(Comparator comparator){
        super();
        setComparator(comparator);
    }

    @Override
    public void setComparator(Comparator<? super T> comparator) {
        super.setComparator(comparator);
    }

    @Override
    public void sort(T[] array) {
        int d = findMax(array);
        int[] count = new int[d+1];
    }

    private int findMax(T[] array) {
        int max = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i].getDigitMaxValue() > max) max = array[i].getDigitMaxValue();
        }
        return max;
    }

    @Override
    protected void swap(T[] array, int i, int j) {
        super.swap(array, i, j);
    }

    @Override
    protected int compare(T firstKey, T secondKey) {
        return super.compare(firstKey, secondKey);
    }

    @Override
    protected boolean greater(T firstKey, T secondKey) {
        return super.greater(firstKey, secondKey);
    }

    @Override
    protected boolean lesser(T firstKey, T secondKey) {
        return super.lesser(firstKey, secondKey);
    }
}
