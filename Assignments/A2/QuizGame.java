import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        // Reading questions from file
        try {
            BufferedReader br = new BufferedReader(new FileReader("questions.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String q = line;
                String a = br.readLine();
                String b = br.readLine();
                String c = br.readLine();
                String d = br.readLine();
                String correct = br.readLine();

                String[] options = { a, b, c, d };
                questions.add(new Question(q, options, correct));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }
        // Shuffle questions
        Collections.shuffle(questions);

        System.out.println("Welcome to the Java Quiz!\n");

        Scanner sc = new Scanner(System.in);
        int total = questions.size();
        int correctCount = 0;
        int qNo = 1;

        for (Question q : questions) {
            System.out.println("Q" + qNo + ". " + q.questionText);
            System.out.println("A. " + q.options[0]);
            System.out.println("B. " + q.options[1]);
            System.out.println("C. " + q.options[2]);
            System.out.println("D. " + q.options[3]);
            System.out.print("Enter your answer (A/B/C/D): ");
            String ans = sc.nextLine();

            if (q.isCorrect(ans)) {
                System.out.println("Correct!\n");
                correctCount++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.correctAnswer + "\n");
            }
            qNo++;
        }
        double accuracy = (correctCount * 100.0) / total;
        System.out.println("You scored " + correctCount + " out of " + total);
        System.out.println("Accuracy: " + accuracy + "%");

        sc.close();
    }
}

