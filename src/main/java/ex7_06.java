import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex7_06 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[15];
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < 15; i++)
        {
            list[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0) {
                evenSum += list[i];
            } else {
                oddSum += list[i];
            }
        }
        if (evenSum > oddSum) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
