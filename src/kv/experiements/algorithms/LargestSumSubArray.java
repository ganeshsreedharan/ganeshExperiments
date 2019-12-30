package kv.experiements.algorithms;

public class LargestSumSubArray {

     static void findLargestSumSubArray(int[] array){

         int end=0;
         int max =0;
         // To Print indexes
         int firstIndex=0;
         int lastIndex =0;
         int s=0;
         for (int i = 0; i < array.length ; i++) {
             end += array[i];
             if(max < end){
                 max = end;
                 firstIndex =s;
                 lastIndex =i;
             }
             if(end < 0){
                 end=0;
                 s=i+1;
             }

         }
         System.out.println("max sum from a sub array "+max);
         System.out.println("start index "+firstIndex +" end index "+lastIndex);
     }
    public static void main(String[] args) {
        int[] array=new int[]{-2,-3,4,-1,-2,5,-3};
        findLargestSumSubArray(array);
    }

}
