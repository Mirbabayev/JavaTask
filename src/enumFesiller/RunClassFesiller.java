package enumFesiller;

public class RunClassFesiller {
    public static void main(String[] args) {
        Fesiller[] fesil = Fesiller.values();
        for (int i = 0; i < fesil.length; i++) {
            System.out.println(fesil);
        }

    }
}
