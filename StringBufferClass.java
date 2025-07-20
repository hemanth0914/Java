public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hemanth");
        System.out.println(sb.capacity());
        sb.insert(1, "Dhoni");
        System.out.println(sb);
    }
}
