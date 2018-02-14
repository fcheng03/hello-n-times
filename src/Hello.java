public class Hello
{
    public static void hello(String message, int count)
    {
        // your code here
        for (int counter = 0; counter < count; counter++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args)
    {
        hello("hello world", 4);
    }


}
