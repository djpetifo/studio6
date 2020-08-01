import Questions.CheckBox;
import Questions.MultipleChoice;
import Questions.Question;
import Questions.TrueFalse;

import java.util.*;

public class QuizRunner {

    public static void main(String[] args) {
        Map<String, Integer> score = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        Question question1 = new MultipleChoice("What is the capital of Florida?",
                "Tallahassee", new String[]{"Tampa", "Miami", "Orlando", "Tallahassee"});

        Question question2 = new TrueFalse("Grass is green", "true", new String[]{"true", "false"});

        Question question3 = new CheckBox("James is...",
                "Funny" ,new String[]{"Smart", "Funny", "Tall", "Handsome"});

        questions.add(question1);
        questions.add(question2);
        questions.add(question3);

        for(int i = 0; i < questions.size(); i++) {

            Question current = questions.get(i);
            System.out.println(current);
            int answer = scan.nextInt();
            current.setUserAnswer(current.getPossibleAnswers()[answer]);

            score.merge(current.evaluate(), 1, Integer::sum);

        }

        scan.close();

        System.out.printf("You got %d out of %d questions correct",
                score.get("Correct"), questions.size());


    }
}
