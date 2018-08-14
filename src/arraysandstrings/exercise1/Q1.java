package arraysandstrings.exercise1;

public class Q1 {

    public static void main(String[] args) {

        Integer[] arr1 = new Integer[] {1,2,3,4,5,6,7,8};
        System.out.println("The total is " + arraySum(arr1));
    }

    private static int arraySum(Integer[] arr) {
       int sum = 0;
        for (Integer arrays: arr) {
            sum += arrays;
        }
        return sum;
    }
}
