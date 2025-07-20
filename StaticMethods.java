class Mobile{
    int price;
    String name;
    static String kind;

    Mobile(int price, String name, String kind){
        this.price = price;
        this.name = name;
        Mobile.kind = kind;
    }

    public void show(){
        System.out.println(price + " " + name + " " + kind);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.price + " " + obj.name + " " + kind );
    }
}


public class StaticMethods {
    public static void main(String[] args) {
        Mobile obj = new Mobile(134, "Iphone", "SmartPhone");
        Mobile.show1(obj);
        Mobile obj2 = new Mobile(124, "Samsung", "Phone");
        obj2.show();
    }
}
