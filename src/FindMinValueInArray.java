import java.util.Scanner;

public class FindMinValueInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int myArray[] = new int[size];
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("Enter value for index %-5d", i);
            myArray[i] = input.nextInt();
            if (i==0){
                min = myArray[i];
            } else if (min > myArray[i]){
                min = myArray[i];
            }
        }
        for (int e :
                myArray) {
            System.out.printf("%-5d",e);
        }
        System.out.println("Min value is: " + min);
    }
}
