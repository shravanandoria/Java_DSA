package Strings;

import java.util.ArrayList;

public class KeyPadPermutation {
    public static void main(String[] args) {
        String num = "12";
        System.out.println(padCount("", num));
    }

    static int padCount(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }

        int count = 0;
        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            count += padCount(p + ch, up.substring(1));
        }
        return count;
    }

    static ArrayList<String> padArr(String p, String up){
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            ans.addAll(padArr(p + ch, up.substring(1)));
        }

        return ans;
    }

    static void pad(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

}
