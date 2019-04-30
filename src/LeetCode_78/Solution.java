package LeetCode_78;

import java.util.ArrayList;
import java.util.List;


//组合的方式:x
//① 最外层循环逐一从 nums 数组中取出每个元素 num
//② 内层循环从原来的结果集中取出每个中间结果集，并向每个中间结果集中添加该 num 元素
//③往每个中间结果集中加入 num
//④将新的中间结果集加入结果集中
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<>());
        for (int num : nums) {
            int size = res.size();
            for (int i = 0; i < size; i++) {
                List<Integer> temp = new ArrayList<>(res.get(i));  //逐一取出中间结果集
                temp.add(num);  //
                res.add(temp);  //
            }
        }
        return res;
    }
}
