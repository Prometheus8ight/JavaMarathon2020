package day18;

public class Task1 {
    public static void main(String[] args) {
            int[] numbers = {432, 529, 173, 432, 823, 462};
        System.out.println(recursionSum(numbers,0));
    }



    public static int recursionSum(int[] Array, int index) {
        if (index==(Array.length) - 1)
            return Array[index];
        return Array[index] + recursionSum(Array, index+1);
    }
}
