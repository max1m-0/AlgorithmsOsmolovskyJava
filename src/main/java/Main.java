import Tasks.Task1;
import Tasks.Task2;
import Tasks.Task3;
import Tasks.Task4;
import Utils.InputUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final List<String> nameList = new ArrayList<>();
    public static final String output = "Привет";
    public static final int comparisonNumber = 7;
    public static final int numberToDivide = 3;
    public static final String bracketSubsequence = "[((())()(())]]";

    public static void main(String[] args) {
        nameList.add("Вячеслав");

        System.out.println(Task1.compareNumber(InputUtil.getInt("число которое надо сравнить"), comparisonNumber, output));

        System.out.println(Task2.checkName(nameList, InputUtil.getString("имя для сравнения")));

        List<Integer> task3List = Task3.getArrayMultiplesOfNumber(InputUtil.getIntList(InputUtil.getInt("длину массива")), numberToDivide);
        for (Integer integer : task3List) {
            System.out.print(integer + " ");
        }

        System.out.println(Task4.isValidBrackets(bracketSubsequence));
    }


}
