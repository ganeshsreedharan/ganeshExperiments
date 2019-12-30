package kv.experiements.algorithms;

public class Recursion {

    int findRecursion(int n){

        if(n==1){
            return  1;
        }
        else{
            return n * findRecursion(n-1);
        }
    }

    int findRecursionOptimised(int n){
        return optimisedFindREcursion(1,4);
    }

    int optimisedFindREcursion( int accumulator,int n){
        if(n==1)return accumulator;
         return optimisedFindREcursion(n*accumulator,n-1);
    }

    public static void main(String args[]){
        Recursion recursion =new Recursion();
        System.out.println( recursion.findRecursion(4));
        System.out.println( "---------------------------------");
        System.out.println( recursion.findRecursionOptimised(4));


    }

}
