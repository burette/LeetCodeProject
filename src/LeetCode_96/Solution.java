package LeetCode_96;


//这是用递归做的,耗时严重,尝试通过数组来记录先前的结果,避免重复计算
//class Solution {
//    public int numTrees(int n) {
//        if(n==0){
//            return 0;
//        }
//        if(n==1){
//            return 1;
//        }
//        if (n==2){
//            return 2;
//        }
//        else {
//            int result = 0;
//            for(int i = 0;i<n;i++){
//                result += numTrees(i)*numTrees(n-i-1);
//            }
//            return result;
//        }
//    }
//}

class Solution {
    public int numTrees(int n) {
        if (n < 2) {
            return 1;
        }
        int[] result = new int[n];
        for (int i = 0; i <= n; i++) {
            result[i] = 0;
        }
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                result[i] += result[j]*result[i-j-1];
            }
        }
        return result[n];
    }
}