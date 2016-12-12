import java.util.Random;

/**
 * Created by Глеб on 04.12.2016.
 */
public class UsualStudent extends AbstractStudent {

    UsualStudent(String firstName, String secondName, String lastName, int numbersOfLessons){
        super(firstName, secondName, lastName,numbersOfLessons);
    }

    @Override
    public boolean passTest(int numbersOfLessons) {
        if (numbersOfLessons == 20){
            return true;
        }
        if (numbersOfLessons <= 10){
            return false;
        }else {
            Random random = new Random();
            numbersOfLessons = random.nextInt(1);
            if (numbersOfLessons == 1){
                return true;
            }else {
                return false;
            }
        }
    }
}
