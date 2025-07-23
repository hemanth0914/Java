abstract class Phone{
    public abstract void call();

    public void msg(){
        System.out.println("Can message");
    }
}

class Iphone extends Phone{                 // Concrete class
    public void call(){
        System.out.println("Can call");
    }
}


public class Abstract {
    public static void main(String[] args) {
        Phone obj = new Iphone();
        obj.call();
        obj.msg();
    }

}
