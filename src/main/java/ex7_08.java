import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ex7_08 {

    private static List<String> strings;

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int size = 5;

        strings = new ArrayList<String>();

        for (int i = 0; i < size; i++) {
            strings.add(reader.readLine());
        }

        String max = strings.get(0);
        for (int i = 1; i < strings.size(); i++)
        {
            if (strings.get(i).length() > max.length())
            {
                max = strings.get(i);
            }
        }
        for (int i = 0; i < strings.size(); i++)
        {
            if (max.length() == strings.get(i).length())
            {
                System.out.println(strings.get(i));
            }
        }

    }
}
