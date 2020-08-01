package Questions;

import java.util.Arrays;

public class Question {

    private String question;
    private String answer;
    private String[] possibleAnswers;
    private String userAnswer;

    public Question(String question, String answer, String[] possibleAnswers) {
        this.question = question;
        this.answer = answer;
        this.possibleAnswers = possibleAnswers;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public String[] getPossibleAnswers() {
        return possibleAnswers;
    }

    @Override
    public String toString() {
        return String.format("Please select a number from 0 - %d for your answer%n%n" +
                "Question: %s%nPossible Answers: %s", this.possibleAnswers.length - 1, this.question, Arrays.toString(this.possibleAnswers));
    }

    public String evaluate() {
       if(getUserAnswer().equals(this.answer)){
           return "Correct";
       } else {
           return "Incorrect";
       }

    }

}
