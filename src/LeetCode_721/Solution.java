package LeetCode_721;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @Author: burette
 * @Date: 2019/6/22 15:08
 */
public class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {

        List<List<String>> res = new LinkedList<>();

        for (List<String> accout : accounts) {

            Set<String> emails = getEmails(accout);

            for (List<String> temp : res) {
                Set<String> emails_temp = getEmails(temp);
                if (!isRetain(emails,emails_temp)){

                }
            }
        }

        return res;
    }

    Set<String> getEmails(List<String> account) {
        Set<String> ret = new HashSet<>();
        for (int i = 1; i < account.size(); i++) {
            ret.add(account.get(i));
        }
        return ret;
    }

    boolean isRetain(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>();
        result.clear();
        result.addAll(set1);
        result.retainAll(set2);
        if (result.size() == set1.size() + set2.size()) {
            return false;
        } else {
            return true;
        }
    }
}
