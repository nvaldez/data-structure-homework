import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // part 1 of the homework
        int nums[] = {1,2,3,4,5};
        int sum = 0;

        for (int i = 0; i < nums.length; i++){

            sum = sum + nums[i];
        }
        System.out.println("\nThe sum for part one is: " + sum);

        //part 2 of the homework
        // the output for part 2 of the homework is 2. exampleArray only goes into the
        // if statement twice.

        System.out.println("\ntoPower static method output: " + toPower(4, 2));
    }

    // part 3 fo the homework
    public static ArrayList<Integer> toPower(int size, int power){
        int total = 0;

        ArrayList<Integer> power2 =  new ArrayList<Integer>();

        for (int i = 0; i < size; i++){

                total = i;
            for (int j = 1; j < power; j++){

                total = total * i;
            }

            power2.add(total);
        }

        return power2;
    }
}
