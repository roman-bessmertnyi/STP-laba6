package laba6;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        long time = System.nanoTime();
        WordAnalytics solver = new WordAnalytics("words.txt");
        solver.sort();
        System.out.println((System.nanoTime() - time) * Math.pow(10, -6) + " millisec");
        getMemoryConsumption();

        getWordsInformation(solver);
    }

    private static void getWordsInformation(WordAnalytics solver) {
        int simpleWordsCount = solver.getSimpleWords().size();
        int partlyConcatenatedWordsCount = solver.getPartlyConcatenatedWords().size();
        int fullyConcatenatedWordsCount = solver.getFullyConcatenatedWords().size();
        System.out.println("Simple words: " + simpleWordsCount);
        System.out.println("Partly concatenated words: " + partlyConcatenatedWordsCount);
        System.out.println("Fully concatenated words: " + fullyConcatenatedWordsCount);
        if (simpleWordsCount == 0 && partlyConcatenatedWordsCount == 0 && fullyConcatenatedWordsCount == 0)
            System.out.println("ERROR");

        List<String> longestWords = solver.getConcatenatedWordByLengthAt(1);
        System.out.println("The longest concatenated word: " + longestWords +
                " with length " + longestWords.get(0).length());
        System.out.println("The 2nd longest concatenated word: " + solver.getConcatenatedWordByLengthAt(2));
    }

    private static void getMemoryConsumption() {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.printf("Memory used: %d B \n", memory);
    }
}