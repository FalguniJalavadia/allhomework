import sun.security.util.Length;

public class Totalnumberofa {
    public static void main(String[] args) {
        String someString = "banana";
        char someChar = 'a';
        int count = 0;

        for (int i = 0; i < someString.length(); i++)
        {
            if (someString.charAt(i) == someChar)
                count++;
            }

        System.out.println("Number of char=" +count);
    }
}
