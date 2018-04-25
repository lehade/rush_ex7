import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex7_17 {

    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }
        ArrayList<String> result = doubleValues(list);

        for (String s : result) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код

        for (int i = 0; i < list.size(); i += 2)
        {
            list.add(i+1,list.get(i));
        }

        return list;
    }

}