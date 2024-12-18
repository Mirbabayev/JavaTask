public class Customer {
//    class yarat ,musteri siyahisi olsun.name ve debt 350 den yuxarilar secilsin ve
//    uzerine 50 faiz borcu gelsin.burda stream filter() islederek ekrana yazin
    String cusName;
    double cusBorc;
    Customer(String cusName,double cusBorc){
        this.cusName=cusName;
        this.cusBorc=cusBorc;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public double getCusBorc() {
        return cusBorc;
    }

    public void setCusBorc(double cusBorc) {
        this.cusBorc = cusBorc;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusName='" + cusName + '\'' +
                ", cusBorc=" + cusBorc +
                '}';
    }
}
