package BackTracking;

import java.util.ArrayList;

public class Introduction {
    public static void main(String[] args) {
        System.out.println(pathDiagonal(3, 3, ""));
//        System.out.println(ans);
//        System.out.println(pathArray(3,3,""));
    }

    static ArrayList<String> pathArray(int r, int c, String p) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r > 1) {
            ans.addAll(pathArray(r - 1, c, p + "D"));
        }

        if(c > 1) {
            ans.addAll(pathArray(r, c - 1, p + "R"));
        }

        return ans;
    }

    static ArrayList<String> pathDiagonal(int r, int c, String p) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r > 1) {
            ans.addAll(pathDiagonal(r - 1, c, p + "V"));
        }
        if(c > 1) {
            ans.addAll(pathDiagonal(r, c - 1, p + "H"));
        }
        if(c > 1 && r > 1) {
            ans.addAll(pathDiagonal(r - 1, c - 1, p + "D"));
        }

        return ans;
    }

    static void path(int r, int c, String p) {
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r > 1) {
            path(r - 1, c, p + "D");
        }
        if(c > 1) {
            path(r, c - 1, p + "R");
        }

    }

    static int count(int r, int c) {
        if(r == 1 || c == 1) {
            return 1;
        }

        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }
}
