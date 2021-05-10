package com.maxqiu.demo.normal;

/**
 * Nim 游戏
 * 
 * https://leetcode-cn.com/problems/nim-game/submissions/
 * 
 * @author Max_Qiu
 */
public class Issue0292 {
    public static void main(String[] args) {
        System.out.println(canWinNim(4));
        System.out.println(canWinNim(5));
    }

    public static boolean canWinNim(int n) {
        return (n % 4 != 0);
    }
}
