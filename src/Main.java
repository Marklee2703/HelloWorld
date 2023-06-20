import MyPackage.MyFirstClass;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("I am using my class");

        MyFirstClass myFirstObject = new MyFirstClass("Lei Song",10);
        System.out.println(myFirstObject.getName());
        System.out.println(myFirstObject.getAge());
        myFirstObject.setAge(19);
        System.out.println(myFirstObject.getName());
        System.out.println(myFirstObject.getAge());
    }
}