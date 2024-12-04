package collection;

import java.util.LinkedList;

public class ColleTask {
    public static void main(String[] args) {
//        linked list duzelt icini doldur string ile

        LinkedList<String> myList = new LinkedList<>();

        myList.add("baki");
        myList.add("istanbul");
        myList.add("tokyo");
        myList.add("kyoto");
        myList.add("akinava");
        String max = myList.get(0);
        String min = myList.get(0);
        for (String e : myList) {
            if (e.length()>max.length()) {
                e = max;
            }
        }
        System.out.println(max);


    }
}
