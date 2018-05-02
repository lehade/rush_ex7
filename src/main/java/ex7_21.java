import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex7_21 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++)
        {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        maximum = Integer.MIN_VALUE;
        minimum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > maximum)
                maximum = numbers[i];

            if(numbers[i] < minimum)
                minimum = numbers[i];
        }



        System.out.print(maximum + " " + minimum);
    }
}