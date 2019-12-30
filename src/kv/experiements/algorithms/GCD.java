package kv.experiements.algorithms;

public class GCD {

    //Euclidean algorithm
    static int findGcd(int a, int b){
        if(b==0) return a;
        return findGcd(b,a%b);
    }

    static int findGcd(int [] a){
        int n= a.length;
        int result=a[0];
        for (int i=1;i<n;i++){
            result=findGcd(result,a[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findGcd(5,4));
        System.out.println(findGcd(new int[]{ 2, 4, 8,16}));
    }
}
