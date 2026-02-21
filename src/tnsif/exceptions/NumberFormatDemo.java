package tnsif.exceptions;

public class NumberFormatDemo {
    public static void main(String[] args) {

        try {
            String str = "abc";
            int num = Integer.parseInt(str);
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }
}