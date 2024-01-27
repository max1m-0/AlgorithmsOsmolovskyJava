package Tasks;

import com.google.common.collect.HashBiMap;
import java.util.Deque;
import java.util.LinkedList;

public class Task4 {
    public static String isValidBrackets(String input) {
        HashBiMap<Character, Character> bracketSubsequence = HashBiMap.create();
        bracketSubsequence.put(')', '(');
        bracketSubsequence.put('}', '{');
        bracketSubsequence.put(']', '[');
        Deque<Character> stack = new LinkedList<>();
        Deque<Character> correctStack = new LinkedList<>();

        for (char i : input.toCharArray()) {
            if (!bracketSubsequence.containsValue(i) && !bracketSubsequence.containsKey(i))
            {
                return "не правильный ввод";
            }
            else
            try {
                if (bracketSubsequence.containsValue(i)) {
                    stack.push(i);
                    correctStack.add(i);
                }
                else if (!stack.isEmpty() && i != bracketSubsequence.inverse().get(stack.peekFirst()) && !bracketSubsequence.containsValue(i) && bracketSubsequence.containsValue(i)) {
                    for (int j = 0; j < stack.size()-1; j++) {
                        correctStack.add(bracketSubsequence.inverse().get(stack.removeFirst()));
                        j--;
                }
                }
                if (bracketSubsequence.containsKey(i)) {
                    if( stack.isEmpty() || stack.peekFirst() != bracketSubsequence.get(i)){
                        correctStack.add(bracketSubsequence.get(i));
                        correctStack.add(i);
                        if (!stack.isEmpty()){
                            correctStack.add(bracketSubsequence.inverse().get(stack.removeFirst()));
                        }

                    }
                    else {
                        correctStack.add(i);
                        stack.removeFirst();
                    }
                }
            } catch (
                    Exception ignored) {
            }
        }
        for (char i : stack) {
            correctStack.add(bracketSubsequence.inverse().get(i));
        }
        if (correctStack.size() == input.length())
            return "Да";
        else {
            return "Нет. Нужно сделать последовательность такой: " + correctStack;
        }
    }
}
