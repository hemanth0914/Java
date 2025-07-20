class Mobile{
    Mobile(String brand, int price, String kind){
        this.brand = brand;
        this.price = price;
        Mobile.kind = kind;
    }
    String brand;
    int price;
    static String kind;
}


public class StaticVaribles {
    public static void main(String[] args) {
        Mobile iphone = new Mobile("iphone", 1700, "Phone");
        Mobile samsung = new Mobile("samsung", 1200, "SmartPhone");
        System.out.println(iphone.brand + " " + iphone.price + " " + Mobile.kind );
        System.out.println(samsung.brand + " " + samsung.price + " " + Mobile.kind);
    }
}
