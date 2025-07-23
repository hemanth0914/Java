
class A{
    public void show(){
        System.out.println("INside A show");
    }

    public void config(){
        System.out.println("Inside A config");
    }
}

class B extends A{
    public void config(){
        System.out.println("In B config");
    }
}



public class Overriding {
    public static void main(String[] args) {
        B b = new B();
        b.config();
        b.show();
    }
}
