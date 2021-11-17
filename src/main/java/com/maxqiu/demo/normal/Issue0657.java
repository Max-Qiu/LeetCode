package com.maxqiu.demo.normal;

/**
 * @author Max_Qiu
 */
public class Issue0657 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
    }

    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char b : moves.toCharArray()) {
            switch (b) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
