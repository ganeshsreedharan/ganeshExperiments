package kv.experiements.algorithms;

import com.sun.xml.internal.ws.util.StringUtils;

public class LargestCommonSubSequence {

    static int findLargestCommonSubSequence(String firstString,String secondString,int m,int n){
        if(firstString != null && secondString != null) {

            char[] first = firstString.toCharArray();
            char[] second = secondString.toCharArray();


            if (m == 0 || n == 0) {
                return 0;
            }
            if (first[m - 1] == second[n - 1]) {
                return 1 + findLargestCommonSubSequence(firstString, secondString, m - 1, n - 1);
            } else {
                return Math.max(findLargestCommonSubSequence(firstString, secondString, m, n - 1), findLargestCommonSubSequence(firstString, secondString, m - 1, n));
            }
        }
        else {
            System.out.println("Give valid Strings");
            return -1;
        }
    }

    public static void main(String[] args) {
        String X = "AGGTAB";
        String Y = "GXTXAYB";

        int m = X.length();
        int n = Y.length();

        System.out.println("Length of LCS is"
                + " " + findLargestCommonSubSequence(X, Y, m, n));
    }
}
