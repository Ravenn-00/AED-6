package ejercicio4;

public class Test {
    public static void main(String[] args) {
        String[] testCases = {
            "()()()[()]()",
            "((()))[]",
            "([])[](",
            "([{)]}",
            "[",
            "[][][]{{{}}}",
            "",
            "(",
            ")",
            "([{}])",
            "([)]",
            "{[()]}",
            "{[(])}",
            "{[()()]}",
        };

        for (String testCase : testCases) {
            boolean result = Corchetes.symbolBalancing(testCase);
            System.out.printf("%-20s%-15s%n", testCase, result);
        }
    }
}