package Strings;

import java.util.ArrayList;

public class DiceAmazon {
    public static void main(String[] args) {
//        System.out.println(diceArray("", 4));
        dice("", 4);
    }

    static void diceFace(String p, int target, int face) {
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i, face);
        }
    }

    static ArrayList<String> diceArray(String p, int target){
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target ; i++) {
            ans.addAll(diceArray(p + i, target - i));
        }

        return ans;
    }

    static void dice(String p, int target) {
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {
            dice(p + i, target - i);
        }
    }
}
