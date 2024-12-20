import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringList {

    public static void main(String[] args) {
//        Bir string tipde list icerisin stringle doldur ve
//        map istifade et ve stringlerin tek tek herflerine ayir
//        List daxilinde list integer tipinde icerisin doldur ve map et ekrana yazdir

        List<List> list=new ArrayList<>();
        List<Integer> intList=Arrays.asList(1,2,3,4,5);
        List<Integer> intList2=Arrays.asList(6,7);
        List<Integer> intList3=Arrays.asList(8,9,10);
        List<Integer> intList4=Arrays.asList(12,13,14);
        list.add(intList);
        list.add(intList2);
        list.add(intList3);
        list.add(intList4);

        list.stream()
                .map(m->m)
                .forEach(m-> System.out.println(m));
/* netice
[1, 2, 3, 4, 5]
[6, 7]
[8, 9, 10]
[12, 13, 14]
*/








//        var stringList = new ArrayList<>();
//        stringList.add("salam");
//        stringList.add("imtahan");
//        stringList.stream()
//                .forEach(f-> System.out.println(Arrays.toString(f.toString().split(""))));




    }


}
