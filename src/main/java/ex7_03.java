import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex7_03 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] list = new String[10];
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++)
        {
            list[i] = reader.readLine();
            numbers[i] = list[i].length();
            System.out.println(numbers[i]);
        }


    }
}
