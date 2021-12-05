package com.maxqiu.demo.normal;

import java.util.HashSet;
import java.util.Set;

/**
 * 771. 宝石与石头
 *
 * https://leetcode-cn.com/problems/jewels-and-stones/
 *
 * @author Max_Qiu
 */
public class Issue0771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        Set<Byte> set = new HashSet<>();
        for (byte aByte : jewels.getBytes()) {
            set.add(aByte);
        }
        int count = 0;
        for (byte aByte : stones.getBytes()) {
            if (set.contains(aByte)) {
                count++;
            }
        }
        return count;
    }
}
