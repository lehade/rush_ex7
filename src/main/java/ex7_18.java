import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex7_18 {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1).length()>list.get(i).length()){
                System.out.println(i);
                break;
            }
        }

    }
}
