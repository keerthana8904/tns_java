package tnsif.exceptions;

public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {

        try {
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);  // Invalid index
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range!");
        }
    }
}