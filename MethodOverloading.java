class Calculator {
    public int add(int num1, int num2){
        return num1 + num2;
    }
    public double add(int num1, double num2){
        return num1 + num2;
    }
}

class MethodOverloading {
    public static void main(String args[]){
        int num1 = 10;
        double num2 = 5.5;
        Calculator calc = new Calculator();
        System.out.println(calc.add(num1, num2));
    }
}