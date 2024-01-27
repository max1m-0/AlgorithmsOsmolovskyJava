package Tasks;

import java.util.List;

public class Task3 {
    public static List<Integer> getArrayMultiplesOfNumber(List<Integer> intList, int numberToDivide){
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) % numberToDivide != 0)
            {
                intList.remove(i);
                i--;
            }
        }
        return intList;
    }
}
