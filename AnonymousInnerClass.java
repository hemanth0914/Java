class A{
    public void show(){
        System.out.println("Inside A Class");
    }
}


public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A()
        {
            public void show(){
                System.out.println("Inside new anonymous class");
            }
        };

        obj.show();
    }
}
