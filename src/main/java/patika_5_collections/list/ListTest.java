package patika_5_collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(30);

        ArrayList<Integer> integers1 = new ArrayList<>();

        List<String> shopingList = new ArrayList<>();
        shopingList.add("Grapes");
        shopingList.add("Banana");
        shopingList.add("Banana");
        shopingList.add("Apple");
        shopingList.add(1, "Mango");

        for (String s : shopingList) {
            System.out.println(s);
        }

        boolean isAppleRemoved = shopingList.remove("Apple");
        System.out.println("isAppleRemoved: " + isAppleRemoved);

        boolean isRemoved = shopingList.remove("Ejder Meyvesi");
        System.out.println("isRemoved: " + isRemoved);

        System.out.println(shopingList);

        ArrayList<String> shopingList2 = new ArrayList<>();

        shopingList2.add("Milk");

        shopingList.addAll(shopingList2);

        System.out.println(shopingList);

        System.out.println(shopingList.contains("Milk"));

        System.out.println("Alış-veriş Listenizde " + shopingList.size() + " adet ürün var");

        System.out.println(shopingList.getLast());

        //-- LinkedList

        System.out.println("LinkedList");

        LinkedList<String> LinkedList = new LinkedList<>();

        List<String> names = new LinkedList<>();
        names.add("Tolga");
        names.add("patika");
        names.add("java kursu");

        System.out.println(names);

    }
}
