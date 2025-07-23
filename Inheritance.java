class Calc{
    public int add(int n1, int n2){
        return n1+ n2;
    }

    public int sub(int n1, int n2){
        return n1-n2;
    }
}

class SuperCalc extends Calc{
    public int multiply(int n1, int n2){
        return n1 * n2;
    }

    public int divide(int n1, int n2){
        return n1 / n2;
    }
}


public class Inheritance {
    public static void main(String[] args) {
        SuperCalc sc = new SuperCalc();
        System.out.println(sc.add(10, 5));
        System.out.println(sc.multiply(10, 5));
    }
}
