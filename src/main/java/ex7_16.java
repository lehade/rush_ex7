import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ex7_16 {

    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<String>();
        for (String str : list) {
            if (str.contains("р") && !str.contains("л")) continue;
            if (!str.contains("р") && str.contains("л")) newList.add(str);
            newList.add(str);
        }
        return newList;
    }

}
