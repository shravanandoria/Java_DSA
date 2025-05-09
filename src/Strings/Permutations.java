package Strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        int digit = '5' - '0';
        System.out.println(digit);
//        String str = "abc";
//        ArrayList<String> ans = permutationsArray("", str);
//        System.out.println(ans);
    }

    static ArrayList<String> permutationsArray(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsArray(f + ch + s, up.substring(1)));
        }

        return ans;
    }
    static void permutations(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

}
