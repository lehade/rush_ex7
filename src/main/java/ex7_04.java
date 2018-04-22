import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex7_04 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[10];

        for (int i = 0; i < 10; i++)
        {
            list[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 9; i > -1; i--)
            System.out.println(list[i]);
    }
}
