interface A{
    void show();
}

class B implements A{

    @Override
    public void show() {
        System.out.println("Inside class B show");
        
    }
    
}


public class Interface {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
