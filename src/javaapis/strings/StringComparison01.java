package javaapis.strings;

public class StringComparison01 {

    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        //str1とstr2の比較
        if (str1 == str2) {
            System.out.println ("一致しました");

        }else {
            System.out.println("しませんでした");

        }

    }

}
