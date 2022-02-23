import java.util.Date;
import java.util.Arrays;

public class muscleGroup {
    String day;
    String grpName;
    exercise workouts[] = new exercise[1];
    muscleGroup(String grpName, String day) {
        this.grpName = grpName;
        this.day = day;
    }

    public void add_exercise(exercise new_exercise) {
        if (workouts.length==1) {
            workouts[1] = new_exercise;
        }else {
            exercise copied_exercises[] = workouts;
            workouts = Arrays.copyOf(copied_exercises, copied_exercises.length+1);
            workouts[copied_exercises.length] = new_exercise;
        }
    }

    //getters
    public String get_day() {
        return this.day;
    }
    public String get_name() {
        return this.grpName;
    }
    //setters
    public void set_day(String day) {
        this.day = day;
    }
    public void set_name(String name) {
        this.grpName = name;
    }
    //a collection of sets makes up one exercise...
    //there will be multiple exercises...
    //methods of
}
