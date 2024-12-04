package arraysMethodsTask;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysTask {
    public static void main(String[] args) {

// max ve min deyer tapilmasi
        int[] arr = {23, 5, 33, 57, 12};
        int[] arr2 = {3, 21, 1, 45, 67};
        int result;
        result = Arrays.stream(arr).max().getAsInt();
        System.out.print("arr max deyer: " + result);
        System.out.println("\n-----------------------");
        result = Arrays.stream(arr).min().getAsInt();
        System.out.println("arr min deyer: " + result);
        System.out.println("\n-----------------------");

//        string sort etmek
        String[] str = {"d", "b", "a", "c"};
        Arrays.sort(str);//sort void tipindedir ve bir basa deyer qaytrmir ona gore .toString isletmeliyik
        System.out.println(Arrays.toString(str));

        System.out.println("\n-----------------------");


// element var ya yox Array.asList(array).contains(element)
//                    IntStream.of(array).anyMatch(x->x==element)

        System.out.println(Arrays.asList(str).contains("c"));
        System.out.println(IntStream.of(arr).anyMatch(x -> x == 5));
        System.out.println("\n-----------------------");


//        cem ve ortalama methods
//        Arrays.stream(array).sum()
//        Arrays.stream(array).avarage().getsDouble()
        double[] arr3 = {1, 2, 3, 4, 5};
        double res = Arrays.stream(arr3).sum();
        System.out.println("cem: " + res);
        res = Arrays.stream(arr3).average().getAsDouble();
        System.out.println("ortalama: " + res);

//       array-i tersine cevirme

//                     0   1   2   3   4
        int[] num = {23, 24, 25, 26, 27};
        int a = num.length;
        for (int i = 0; i < num.length; i++) {
            System.out.println(i + "  " + num[a-1]);
            num[i] = num[(a - 1)];

                a--;
        }



    }


}
