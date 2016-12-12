import java.util.Random;

/**
 * Created by Глеб on 04.12.2016.
 */
public class CleverStudent extends AbstractStudent {

    int numbersOfLessons;

    CleverStudent(String firstName, String secondName, String lastName, int numbersOfLessons){
        super(firstName, secondName, lastName, numbersOfLessons);
    }

    @Override
    public boolean passTest(int lessons) {
        if (lessons == 20){
            return true;
        }
        if (lessons <= 10){
            return false;
        }else {
            Random random = new Random();
            lessons = random.nextInt(9);
            if (lessons >= 0 && lessons <= 6){
                return true;
            }else {
                return false;
            }
        }
    }
}
