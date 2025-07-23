class A{
    public int v1 = 5;

    public void meth1(){
        System.out.println("In outer class");
    }

    class B{
        public void meth2(){
            System.out.println("Inside inner class");
        }
    }

    static class C{
        public void meth2(){
            System.out.println("Inside static inner class");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.meth1();

        A.B obj1 = obj.new B();
        obj1.meth2();

        A.C obj2 = new A.C();
        obj2.meth2();

    }

}
