public class Main {
    public static void main(String[] args) {
        String name1 = "A";
        String name2 = "A";
        String name3 = new String(name1);
        String name4 = new String("A");

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name1 == name4);
        System.out.println(name1 == "A");
    }
}