class Student {
    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    int roll;
    String name;
}


public class ArrayofObjects {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Hemanth");
        Student st2 = new Student(2,"Vinni");
        Student students[] = new Student[2];
        students[0] = st1;
        students[1] = st2;
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].name + " " + students[i].roll);
        }
    }
} 
