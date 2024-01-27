package Utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputUtil {
    public static String getString(String inputName)  {
        System.out.println("Введите "+ inputName);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            return reader.readLine();
        }
        catch (Exception e){
            System.out.println("Не правильный ввод данных");
            System.exit(0);
            return "";
        }
    }

    public static int getInt(String inputName){
        System.out.println("Введите "+ inputName);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            return Integer.parseInt(reader.readLine());
        }
        catch (Exception e){
            System.out.println("Не правильный ввод данных");
            System.exit(0);
            return 0;
        }
    }

    public static List<Integer> getIntList(int lengthOfArray){
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < lengthOfArray; i++) {
            intList.add(InputUtil.getInt(i+1 +" число"));
        }
        return intList;
    }
}
