package leetcode;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

public class HandsOfStraight {

    public static boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < hand.length; i++) {
            if (!map.containsKey(hand[i])) {
                map.put(hand[i], 1);
            } else {
                map.replace(hand[i], map.get(hand[i]) + 1);
            }
        }

        while(map.size() > 0) {
            int current_card = map.firstKey();
            for(int i = current_card; i < current_card + groupSize; i++) {
                if(!map.containsKey(i)) {
                    return false;
                }
                int count = map.get(i);
                if(count == 1) {
                    map.remove(i);
                }else {
                    map.replace(i, count - 1);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,6,2,3,4,7,8};
        int size = 3;

        System.out.println(isNStraightHand(array, size));

    }

}
