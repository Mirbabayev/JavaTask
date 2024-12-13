public class Main {
    public static void main(String[] args) {




        var myGen=new MyGeneric<>("Java");
        MyGeneric<String>myGenStr=new MyGeneric<>("Java");
        MyGeneric<Integer> myGenInt=new MyGeneric<>(100);

        myGenStr.print();
        myGenInt.print();









    }
}
