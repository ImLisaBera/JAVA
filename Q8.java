public class ArrayReversal {
    public static void main(String[] args) {
        
        int[] numbers = {3, 4, 6, 1, 9, 7, 5, 8};
        
        
        int length = numbers.length;
        
        
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = numbers[length - 1 - i];
        }

        
        System.out.print("Reversed array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}
