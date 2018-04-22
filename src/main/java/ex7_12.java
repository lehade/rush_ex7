import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex7_12 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < 10; i++){
            strings.add(reader.readLine());
        }
        int maxLength = strings.get(0).length();
        int minLength = strings.get(0).length();

        for (int i = 1; i < strings.size(); i++){
            if (maxLength < strings.get(i).length()){
                maxLength = strings.get(i).length();
            }
        }
        for (int i = 1; i < strings.size(); i++){
            if (minLength > strings.get(i).length()){
                minLength = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == minLength) {
                System.out.println(strings.get(i));
                break;
            } else if (strings.get(i).length() == maxLength) {
                System.out.println(strings.get(i));
                break;
            }
        }
    }
}
