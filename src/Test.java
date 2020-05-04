import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        boolean error = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> randomWords = new ArrayList<>();
        do {
            System.out.println("Pisz cokolwiek aż się powtórzy");
            String word = scanner.nextLine();
            randomWords.add(word);
            for (int i = 1; i < randomWords.size(); i++) {
                if (randomWords.get(i - 1).equals(word)) {
                    error = false;
                }
            }
        } while (error);
    }
}
