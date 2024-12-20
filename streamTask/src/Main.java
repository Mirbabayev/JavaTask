import java.util.*;

public class Main {
    public static void main(String[] args) {
// Setden  istifade ederek list yaradin.
// Stream methodlarindan isdifade ederek
// uzunluğu 5 və ya daha çox olanları seçmək,
//sıralamaq və çap etmək lazimdir.

//        Set<String> myHashList = new HashSet<>();
//
//        myHashList.add("Yanvar");
//        myHashList.add("Fevral");
//        myHashList.add("Mart");
//        myHashList.add("Aprel");
//        myHashList.add("May");
//
//        myHashList.stream()
//                .filter(e -> (e.length() >= 5))
//                .forEach(e -> System.out.println(e));
//
//        System.out.println("-----------------------------");

// LinkedList'le bir list yaradin ,
// Stream methodlarindan isdifade edin ,
// cut ededleri 2 qat artirin , 20 den boyuk olanlari secin, siralayin ve cap edin zehmet olmazsa

//        List<Integer> numList = new LinkedList<>();
//        numList.add(23);
//        numList.add(34);
//        numList.add(56);
//        numList.add(120);
//        numList.add(6);
//        numList.add(24);
//        numList.add(15);
//        numList.add(9);

//        var num = numList.stream()
//                .filter(e -> e % 2 == 0 && e > 20)
//                .map(e -> e * 2)
//                .toList();
//        System.out.println(num);
//
//        num.forEach(i -> System.out.print(i + " "));
        List<Integer> numList = new ArrayList<>();
        numList.add(3);
        numList.add(-4);
        numList.add(-56);
        numList.add(2);
        numList.add(-6);
        numList.add(24);
        numList.add(-15);
        numList.add(9);

        salam(numList);


    }

    //Bir dene array list yaradın   ededlerden ibarət,
//Daha sonra bir Generic method yaradın List tipindən verilənləri alsın.
//Sonra streamla  müsbət ədədləri seçin, hər bir ədədi 2 qat artırın,
// 10 dan böyük olanları seçin , kiçikdən böyüyə artan sıra ilə yazın və çap edin
    public static <T extends Number> void salam(List<T> t) {
        t.stream()
                .filter(f -> f.doubleValue() > 0)
                .map(f -> f.doubleValue() * 2)
                .filter(f->f.doubleValue()>5)
                .forEach(f-> System.out.println(f));
    }
}
