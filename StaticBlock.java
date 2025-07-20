
class Mobile{
    int price;
    String name;
    static String kind;

    Mobile(int price, String name){
        this.price = price;
        this.name = name;
    }

    static{
        kind = "SmartPhone";
        System.out.println("Inside static block");
    }

    public void show(){
        System.out.println(price + " " + name + " " + kind);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.price + " " + obj.name + " " + kind );
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        Mobile obj = new Mobile(134, "Iphone");
        Mobile.show1(obj);
        Mobile obj2 = new Mobile(124, "Samsung");
        obj2.show();
    }
}
