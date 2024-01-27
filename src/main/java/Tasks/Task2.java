package Tasks;

import java.util.List;

public class Task2 {

    public static String checkName(List<String> nameList,String name){
        for (String s : nameList) {
            if (s.trim().equalsIgnoreCase(name.trim())) {
                return "Привет, " + name.trim();
            }
        }
        return "Нет такого имени";
    }
}
