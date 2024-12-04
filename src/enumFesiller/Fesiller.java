package enumFesiller;

public enum Fesiller {
// Fesil enum yaradin ,4 fesli qeyd edin , deyerlerini verin ve minumum temperatur ,max temperatur ve
// description deyisenler elave edin ,getter ve constructor yaradin .
// Fesil haqqinda getFormatInfo method  yazin .
// Mainda cagirin .Fesilller ve onlarin melumatlarini capa verin

    YAZ("yaz 10 - 30"),
    YAY("yay 15 - 45"),
    PAYIZ("payiz 5 - 24"),
    QIS("qis -5 - 18");

    private final String seasonsInfo;

    private Fesiller(String seasons) {
        this.seasonsInfo = seasons;
    }

    public String getSeasonsInfo() {
        return seasonsInfo;
    }
}
