class Student {
    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    int roll;
    String name;
}

public class ForEachLoop {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Hemanth");
        Student st2 = new Student(2,"Vinni");
        Student students[] = new Student[2];
        students[0] = st1;
        students[1] = st2;
        for(Student st: students){
            System.out.println(st.name + " " + st.roll);
        }
    }
}
