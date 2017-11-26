import java.util.*;

import Interfaces.IntKeyObject;
import Sorts.*;
import Structures.SomeIntKeyObject;

//class Generator<T extends Object>{
//
//    public static int[] generate(){
//        int size = 1 + (int)(Math.random() * 100);
//        int list[] = new int[size];
//        for(int j = 0; j < size; j++){
//            list[j] = 1 + (int)(Math.random() * 10000);
//        }
//        return list;
//    }
//
//    public static int[] generate(int size){
//        if (size <= 0) return Generator.generate();
//        int list[] = new int[size];
//        for(int j = 0; j < size; j++){
//            list[j] = 1 + (int)(Math.random() * 10000);
//        }
//        return list;
//    }
//
//    public static int[] generate(int size, int minValue, int maxValue){
//        if (size <= 0) return Generator.generate();
//        int list[] = new int[size];
//        for(int j = 0; j < size; j++){
//            list[j] = minValue + (int)(Math.random() * maxValue);
//        }
//        return list;
//    }
//
//}

//class Sorts {
//
//    public static class MergeSortForObjects <T extends Object & Comparable> implements ISortForObjects<T>{
//
//        private static final String name = "Merge sort";
//        private  Comparator<T> comparator = (o1, o2) -> o1.compareTo(o2);
//
//        @Override
//        public String getName() {
//            return this.name;
//        }
//
//        @Override
//        public void sort(T[] list) {
//            nestedSort(list,0, list.length - 1);
//        }
//
//        private void nestedSort(T[] list, int start, int end){
//            if (start == end) return;
//            int size = (end - start +  1);
//            int pivot =start +  size / 2;
//            nestedSort(list, start, pivot - 1);
//            nestedSort(list, pivot, end);
//            int indexLeft = start, indexRight = pivot, mergedIndex = 0;
//            T mergedList[] = (T[]) new Object[size];
//            while ((indexLeft < pivot)&&(indexRight <= end)){
//                if (less(list[indexLeft], list[indexRight])){
//                    mergedList[mergedIndex++] = list[indexLeft++];
//                }
//                else{
//                    mergedList[mergedIndex++] = list[indexRight++];
//                }
//            }
//            if (indexLeft < pivot)
//                while(indexLeft < pivot){
//                    mergedList[mergedIndex++] = list[indexLeft++];
//                }
//            if (indexRight <= end)
//                while(indexRight <= end){
//                    mergedList[mergedIndex++] = list[indexRight++];
//                }
//            int index = start;
//            for(int i = 0; i < mergedList.length; i++){
//                    list[index++] = mergedList[i];
//            }
//        }
//
//        private boolean less(T o1, T o2){
//            return comparator.compare(o1, o2) <= 0;
//        }
//    }
//
//    public static class SelectionSort implements ISort{
//
//        private static final String name = "Selection sort";
//
//        @Override
//        public String getName() {
//            return this.name;
//        }
//
//        @Override
//        public void sort(int[] list) {
//            for(int i = 0; i < list.length - 1; i++){
//                int foundElement = i + 1;
//                long foundElementValue = list[i + 1];
//                for(int j = i + 1; j < list.length; j++){
//                    if (list[j] < foundElementValue) {
//                        foundElement = j;
//                        foundElementValue = list[j];
//                    }
//                }
//                if (foundElementValue < list[i]) swap(list,i,foundElement);
//            }
//        }
//
//        private void swap(int[] list, int l, int r){
//            int temp = list[l];
//            list[l] = list[r];
//            list[r] = temp;
//        }
//    }
//
//
//
//    public static <T extends ISort> boolean checkSort(int list[], T sortRealization) {
//        int javaSortedList[];
//        int sortedList[];
//        javaSortedList = Arrays.copyOf(list, list.length);
//        sortedList = Arrays.copyOf(list, list.length);
//        Arrays.sort(javaSortedList, 0, javaSortedList.length);
//        sortRealization.sort(sortedList);
//
//        if (!Arrays.equals(sortedList, javaSortedList)) {
//
//            System.out.print("Array: ");
//            for (int i = 0; i < list.length; i++) {
//                System.out.print(list[i] + " ");
//            }
//            System.out.println();
//            System.out.print("Java sort: ");
//            for (int i = 0; i < list.length; i++) {
//                System.out.print(javaSortedList[i] + " ");
//            }
//            System.out.println();
//            System.out.print(sortRealization.getName() + ": ");
//            for (int i = 0; i < list.length; i++) {
//                System.out.print(sortedList[i] + " ");
//            }
//            System.out.println();
//            System.out.println();
//            return false;
//        }
//        return true;
//    }
//
//
//}

//class SomeObject  implements Comparable, IGeneratable{
//    private int value;
//
//    SomeObject(){
//        this.generate();
//    }
////    @Override
//    public void generate() {
//        this.value = 0 + (int)(Math.random() * 100);
//    }
//
////    @Override
//    public int compareTo(Object o) {
//        SomeObject temp = (SomeObject) o;
//        if (this.value > temp.getValue()) return 1;
//        if (this.value == temp.getValue()) return 0;
//        if (this.value < temp.getValue()) return -1;
//        return 0;
//    }
//
//    public int getValue(){
//        return this.value;
//    }
//}

public class Main{

    public static <S extends AbstractSortOnComparisons<T>, T extends Comparable<T>> boolean checkSort(T[] list, S sort) {
        T[] sortedList = Arrays.copyOf(list, list.length);
        sort.sort(sortedList);

        if (!SortUtils.isArraySorted(sortedList)) {
            System.out.print("Array: ");
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println();
            System.out.print(sort.getClass() + ": ");
            for (int i = 0; i < list.length; i++) {
                System.out.print(sortedList[i] + " ");
            }
            System.out.println();
            System.out.println();
            return false;
        }
        else
            System.out.println(sort.getClass() + ":OK");
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        for(int i = 0; i < 50; i++) {
//            IntKeyObject<Integer>[] list = SortUtils.generateArrayIntKeyObjects(10);
//            checkSort(list, new CountingSort<IntKeyObject>());
            Integer[] list = SortUtils.generateArray(10);
            checkSort(list, new ThreeWayQuickSort<Integer>());
        }
        System.out.println("DONE!");
    }
}
