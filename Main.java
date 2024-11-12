import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] numbers = {"5", "20", "1", "10"};

        // sort in scending order using lambda
        String[] ascending = numbers.clone(); // clone to preserve original array
        Arrays.sort(ascending, (a,b) -> Integer.parseInt(a) - Integer.parseInt(b));
        System.out.println("Ascending order: " + Arrays.toString(ascending));

        //sort in descending order using lambda
        String[] descending = numbers.clone();
        Arrays.sort(descending, (a,b) -> Integer.parseInt(b) - Integer.parseInt(a));
        System.out.println("Descending order: " + Arrays.toString(descending));
    }
    
}
