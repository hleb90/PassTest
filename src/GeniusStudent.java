import java.util.Random;

/**
 * Created by Глеб on 04.12.2016.
 */
public class GeniusStudent extends AbstractStudent{

    GeniusStudent(String firstName, String secondName, String lastName, int numbersOfLessons){
        super(firstName, secondName, lastName, numbersOfLessons);
    }

    @Override
    public boolean passTest(int numbersOfLessons) {
        if (numbersOfLessons >= 1){
            return true;
        }else {
            return false;
        }

    }
}
