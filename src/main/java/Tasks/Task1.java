package Tasks;

public class Task1 {
    public static String compareNumber(int inputNumber, int comparisonNumber, String output)
    {
        if (inputNumber > comparisonNumber)
        {
            return output;
        }
        output = inputNumber +" <= " + comparisonNumber;
         return output;
    }
}
