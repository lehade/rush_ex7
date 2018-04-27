import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex7_20 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine()); //line
        int m = Integer.parseInt(reader.readLine()); //elem

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < n; i++){
            list.add(reader.readLine());
        }

        for (int i = 0; i < m; i++) {
            list.add(list.get(0));
            list.remove(0);

        }

        for (int i = 0; i < n; i++)
        {
            System.out.println(list.get(i));
        }

    }

}