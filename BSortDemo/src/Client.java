import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int x = scan.nextInt();
        int[] nArray = generateArray(x);
        for(int a : nArray){
            System.out.print(a + " ");
        }
        System.out.println();

        nArray = sortArray(nArray);
        for(int a : nArray){
            System.out.print(a + " ");
        }

    }

    public static int[] generateArray(int x){
        int[] newArray = new int[x];
        for(int y = 0; y < x; y++){
            newArray[y] = (int)(Math.random()*55) + 1;
        }

        return newArray;
    }

    public static int[] sortArray(int[] sArray){

        for(int x = 0; x < sArray.length; x++){
            for(int j = 0; j < sArray.length-1; j++){
                if(sArray[j] > sArray[j+1]){
                    int temp = sArray[j];
                    sArray[j] = sArray[j+1];
                    sArray[j+1] = temp;
                }
            }
        }

        return sArray;
    }
}
