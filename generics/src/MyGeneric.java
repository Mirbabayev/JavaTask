public class MyGeneric <T>{
//    Bir Generics class yaradin .Icerisinde 1 deyisen olsun ,
//    constructor ve get methodu olsun .Daha sonra Main classinda cagirin ,
//    Integer ve String tipinden deyer öturun .
//
//Neticede ;
// :100: Java


    private T t;

    public MyGeneric(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void print(){

        System.out.println(getT());
    }


}
