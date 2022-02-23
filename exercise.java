import java.util.Date;
import java.util.Arrays;
//collection of sets
public class exercise {
//    Date day;
    Set my_set[] = new Set[1];

    //removing this because muscleGroup will hold date information
    /*exercise(Date day) {
        this.day = day;
    }*/

    public void add_set(Set new_set) {
        if (my_set.length == 1) {
            my_set[1] = new_set;
        }else {
            Set copied_set[] = my_set;
            my_set = Arrays.copyOf(copied_set, copied_set.length+1);
            my_set[copied_set.length] = new_set;
        }
    }
    //getters
    public Set[] get_set() {
        return my_set;
    }

//    public Date get_day() {
//        return this.day;
//    }
//
//    public void set_day(Date day) {
//        this.day = day;
//    }

}
