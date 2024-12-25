public class Main {
    public static void main(String[] args) {
        /*GenericQueue adında bir sinif yaradın. Bu sinif generic olmalı və
        aşağıdakı funksionallıqları təmin etməlidir: Queue-ya element əlavə edə bilmək üçün enqueue metodu.
        Queue-dan ilk daxil olan elementi götürmək üçün dequeue metodu.
        Queue-nun boş olub olmadığını qaytaran bir isEmpty metodu.*/
        int count = 0;
        var ups = new GenericQueue<String>();

        ups.enQueue("salam");
        ups.enQueue("necesen");
        ups.enQueue("ne var ne yox");
        for (String e : ups.myList) {
            count++;
            System.out.println(count + " . " + e);
        }
        ups.dequeue();
        ups.isEmpty();

    }
}
