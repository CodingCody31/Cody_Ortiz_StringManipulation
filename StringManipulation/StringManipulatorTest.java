public class StringManipulatorTest{
    public static void main(String[] args){
        StringManipulator string1 = new StringManipulator();
        String str = string1.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); // HelloWorld 

        StringManipulator string2 = new StringManipulator();
        char letter = 'o';
        Integer a = string2.getIndexOrNull("Coding", letter);
        Integer b = string2.getIndexOrNull("Hello World", letter);
        Integer c = string2.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null

        StringManipulator string3 = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer x = string3.getIndexOrNull(word, subString);
        Integer y = string3.getIndexOrNull(word, notSubString);
        System.out.println(x); // 2
        System.out.println(y); // null

        StringManipulator manipulator = new StringManipulator();
        String word1 = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word1); // eworld
    }
}