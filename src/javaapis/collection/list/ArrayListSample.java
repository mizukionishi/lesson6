package javaapis.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

    public static void main(String[] args) {
        //行きたい国や場所をリストにします
        ArrayList<String> al = new ArrayList<String>();
        al.add("アイスランド");
        al.add("スペイン");
        al.add("ナポリ");
        al.add("リスボン");
        al.add("ヨセミテ国立公園");

        //指定したデータを取得する
        String place = al.get(2);
        System.out.println(place);

        //要素数を数える
        int listCount = al.size();
        System.out.println(listCount);

        //要素を削除
        al.remove(2);
        place = al.get(2);
        System.out.println(place);

        System.out.println("ループここから");

        //全部出力してみる
        for(String nation : al) {
            System.out.println(nation);
        }
    }

}
