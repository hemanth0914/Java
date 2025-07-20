class Human{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    

}


public class Encapsulation {
    public static void main(String[] args) {
        Human hm = new Human();
        hm.setAge(24);
        hm.setName("Hemant");
        System.out.println(hm.getName() + " : " + hm.getAge());
    }
}
