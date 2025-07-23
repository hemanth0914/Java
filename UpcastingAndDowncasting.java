class A{
    public void show1(){
        System.out.println("In class A");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In class B");
    }
}



public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        A obj = new B();  //Upcasting
        obj.show1();

        B obj1 = (B) obj; //DownCasting
        obj1.show2();

    }

}
