package parameters;

public class simpleParameters
{
    
    public static void main(String[] args)
    {
        int number = 10;
        int test = 5;
        writeSpaces(test);
    }
    
    public static void writeSpaces(int number)
    {
        for (int i = 1; i <= number; i++){
            System.out.println("x");
        }
    }
}
