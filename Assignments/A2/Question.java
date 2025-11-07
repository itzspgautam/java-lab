public class Question {
    String questionText;
    String[] options;
    String correctAnswer;

    public Question(String questionText, String[] options, String correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrect(String userAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }
}
