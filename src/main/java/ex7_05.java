import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex7_05 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[20];
        int[] list1 = new int[10];
        int[] list2 = new int[10];

        for (int i = 0; i < 20; i++)
        {
            list[i] = Integer.parseInt(reader.readLine());
            if (i < 10) {
                list1[i] = list[i];
            }
            else {
                list2[i - 10] = list[i];
            }
        }

        for (int i = 10 ; i < 20 ; i++)
            System.out.println(list2[i-10]);
    }
}