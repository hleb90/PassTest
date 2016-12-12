/**
 * Created by Глеб on 04.12.2016.
 */
public abstract class AbstractStudent {

    private String firstName;
    private String secondName;
    private String lastName;
    private int numberOfLessons;

    public AbstractStudent(String firstName, String secondName, String lastName, int numberOfLessons){
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.numberOfLessons = numberOfLessons;
    }

    public abstract boolean passTest(int lessons);

}
