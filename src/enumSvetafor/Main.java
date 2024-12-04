package enumSvetafor;

public class Main {
    public static void main(String[] args) {
        for (Svetafor str : Svetafor.values()) {
            System.out.println(str + " " + str.getAction());
        }
        System.out.println("---------------");




    }
}
