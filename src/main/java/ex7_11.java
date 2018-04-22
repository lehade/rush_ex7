import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex7_11 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int size = 5;

        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < size; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            strings.add(0,strings.get(4));
            strings.remove(strings.size()-1);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(strings.get(i));
        }

    }
}