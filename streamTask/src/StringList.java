import java.util.ArrayList;
import java.util.Arrays;

public class StringList {

    public static void main(String[] args) {
//        Bir string tipde list icerisin stringle doldur ve
//        map istifade et ve stringlerin tek tek herflerine ayir


        var stringList = new ArrayList<>();
        stringList.add("salam");
        stringList.add("imtahan");


        stringList.stream()
                .forEach(f-> System.out.println(Arrays.toString(f.toString().split(""))))
        ;




    }


}
