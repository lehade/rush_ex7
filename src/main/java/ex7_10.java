import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex7_10 {

    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int size = 10;

        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < size; i++) {
            strings.add(0, reader.readLine());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(strings.get(i));
        }

    }

}