package Strings;

public class Stream {
    public static void main(String[] args) {
        String str = "baccapped";
//        skip("", str);
//        System.out.println(skip2(str));
        System.out.println(skipAppNotApple(str));
    }

    static String skipAppNotApple(String up) {
        if(up.isEmpty()) {
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }

    static String skipApple(String p) {
        if(p.isEmpty()) {
            return "";
        }

        if(p.startsWith("apple")) {
            return skipApple(p.substring(5));
        } else {
            return p.charAt(0) + skipApple(p.substring(1));
        }
    }

    static String skip2(String p) {
        if(p.isEmpty()) {
            return "";
        }

        char ch = p.charAt(0);

        if(ch == 'a') {
            return skip2(p.substring(1));
        } else {
            return ch + skip2(p.substring(1));
        }
    }

    static void skip(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }
}
