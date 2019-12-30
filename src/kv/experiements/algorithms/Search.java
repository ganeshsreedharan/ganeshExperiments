package kv.experiements.algorithms;

public class Search {

    int array[]=new int[]{12,2,4,6,7,9};

     int  findElementInSortedArray(int startIndex,int endIndex,int number){

        if(startIndex>endIndex){
            return -1;//No element found
        }
        int midIndex=(startIndex+endIndex)/2;
        if(array[midIndex]== number){
            return midIndex;
        }
        if(array[midIndex] > number){
            return findElementInSortedArray(startIndex,midIndex-1,number);
        }
        else {
            return findElementInSortedArray(midIndex+1,endIndex,number);
        }
    }
    int searchHelper(int number){
         return findElementInSortedArray(0,array.length-1,number);
    }

    public static void main(String[] args) {
        Search s =new Search();
        System.out.println( s.searchHelper(15));
    }
}
