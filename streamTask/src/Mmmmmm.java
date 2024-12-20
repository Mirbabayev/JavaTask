import java.util.ArrayList;
import java.util.List;

public class Mmmmmm {
    //    Bir generic metod yazın, hansı ki:İstənilən tipdən ibarət olan massivdəki elementləri Stream vasitəsilə çap etsin.
//Massiv elementlərini filtrləyib çap etmək üçün şərt tətbiq etsin (məsələn, yalnız müəyyən şərti ödəyən elementləri çap etsin).
//Integer Massiv (cüt ədədlər)://2//4//6
//String Massiv (A ilə başlayanlar)://Aysel//Anar
// Double Massiv (2.0-dan böyük ədədlər)://2.2//3.3//4.4
    public static void main(String[] args) {
//        var wordList = new ArrayList<>();
//        wordList.add("Akif");
//        wordList.add("Elcin");
//        wordList.add("Kenan");
//        wordList.add("Aysel");
//        wordList.add("Aynur");
//        myMethod(wordList);
//
//        System.out.println("\n-----------------------");
//
//        List<Integer> numList = new ArrayList<>();
//        numList.add(3);
//        numList.add(-4);
//        numList.add(-56);
//        numList.add(2);
//        numList.add(-6);
//        numList.add(24);
//        numList.add(-15);
//        numList.add(9);
//        myMethod(numList);
//
//        System.out.println("\n-----------------------");
//
//        List<Double> numList2 = new ArrayList<>();
//        numList2.add(3.5);
//        numList2.add(-4.2);
//        numList2.add(3.0);
//        numList2.add(2.2);
//        numList2.add(-6.4);
//        numList2.add(24.0);
//        numList2.add(9.1);
//        myMethod(numList2);
        List<Double> numList3 = new ArrayList<>();
        myMethod(numList3);
    }

    public static <T> void myMethod(List<T> t) {
       if(!t.isEmpty()){//burda .isEmpty() methodu listin bos olub olmadigin yoxlamaq ucundur
           if (t.get(0) instanceof String) {
               System.out.println("bu stringdir");
               t.stream()
                       .filter(f -> ((String) f).toLowerCase().startsWith("a"))
                       .forEach(f -> System.out.print(f + " "));
           } else if (t.get(0) instanceof Number) {
               if (t.get(0) instanceof Integer) {
                   System.out.println("bu integerdir");
                   t.stream()
                           .filter(f -> ((Integer) f).intValue() % 2 == 0)
                           .forEach(f -> System.out.print(f + " "));
               } else if (t.get(0) instanceof Double) {
                   System.out.println("bu doubledir");
                   t.stream()
                           .filter(f -> ((Double) f).doubleValue() > 2.0)
                           .forEach(f -> System.out.print(f + " "));
               } else {
                   System.out.println("bu type ucun kod yazilmayib");
               }
           }
       }
        else {
            System.out.println("bu list bosdur");
        }
    }
}