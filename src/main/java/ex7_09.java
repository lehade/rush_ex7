import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex7_09 {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int size = 5;

        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < size; i++) {
            strings.add(reader.readLine());
        }

        String min = strings.get(0);
        for (int i = 1; i < strings.size(); i++)
        {
            if (strings.get(i).length() < min.length())
            {
                min = strings.get(i);
            }
        }
        for (int i = 0; i < strings.size(); i++)
        {
            if (min.length() == strings.get(i).length())
            {
                System.out.println(strings.get(i));
            }
        }

    }

}
