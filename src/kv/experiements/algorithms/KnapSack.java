package kv.experiements.algorithms;

public class KnapSack {

    static int solveKnapSack(int[] values,int[] weights,int capacity ){

        if(values.length != weights.length) return -1;
        int widhth =weights.length+1;
        int height =capacity+1;
        int[][] knapsack =new int[widhth][height];

        for(int i=0;i<widhth;i++){
            for(int w=0;w<height;w++){
                if(i == 0||w == 0){
                    knapsack[i][w]=0;
                }
                else if(weights[i-1] <= w) {
                    knapsack[i][w] = Math.max(values[i-1]+ knapsack[i-1][w-weights[i-1]],knapsack[i-1][w]);
                }
                else {
                    knapsack[i][w]=knapsack[i-1][w];
                }
            }
        }

        int res =  knapsack[widhth-1][height-1];
        int w =capacity;
        for(int i = widhth-1;i > 0 && res > 0; i-- ){
           if(res != knapsack[i-1][w]){
               System.out.println(" value "+values[i-1] +" weight "+weights[i-1]);
               res -=values[i-1];
               w  -= weights[i-1];
           }
        }
        return knapsack[widhth-1][height-1];

    }

    public static void main(String[] args) {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 20;
        System.out.println("Max value "+solveKnapSack(val,wt,W));
    }
}
