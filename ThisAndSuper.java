
class A{
    public A(){
        System.out.println("In A cons");
    }

    public A(int n){
        System.out.println("In A cons params");
    }
}

class B extends A{
    public B(){
       
        System.out.println("In B cons");
    }

    public B(int n){

        System.out.println("In B cons params");
    }
}
class C extends B{
    public C(){
        System.out.println("Inside C");
    }

    public C(int n){
        this();
        System.out.println("Inside C params");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        C c = new C(20);
    }

}
