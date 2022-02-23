import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner object
        muscleGroup groups[] = new muscleGroup[1];
        Date today = new Date();

        System.out.println(today.toString());
        System.out.println("How many muscle groups were done today?");
        Integer num_of_exc = input.nextInt();
        for (int i=0; i<num_of_exc;i++) {
            System.out.println("Enter the muscle category here: ");
            String name =  input.nextLine();
            muscleGroup muscles = new muscleGroup(name, today.toString());
        }


        String muscle_group = input.nextLine();

        Set tricep_kickbacks = new Set(45, 12, false);
    }
}
