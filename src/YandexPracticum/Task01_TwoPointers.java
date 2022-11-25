package YandexPracticum;

public class Task01_TwoPointers {
    public static void main(String[] args) {

        String line = "abcabcdddabc";

        System.out.println(maxConsecutiveElements(line));
    }

    public static int maxConsecutiveElements(String line) {

        // currentLetterIndex задаёт позицию первого символа группы (левый указатель),
        // а nextLetterIndex - позицию первого символа следующей группы (правый указатель).
        // Разность этих индексов равна количеству символов в текущей группе.

        int result = 0;
        int currentLetterIndex = 0;

        while (currentLetterIndex < line.length()) {

            int nextLetterIndex = currentLetterIndex;

            while (nextLetterIndex < line.length() &&
                    line.charAt(nextLetterIndex) ==  line.charAt(currentLetterIndex)) {
                ++nextLetterIndex;
            }

            result = Math.max(result, nextLetterIndex - currentLetterIndex);

            currentLetterIndex = nextLetterIndex;

        }

        return result;
    }
}
