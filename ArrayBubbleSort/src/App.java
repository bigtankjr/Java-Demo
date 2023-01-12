import java.util.*;

public class App {
    public static List<Integer> numbers;
    public static void main(String[] args) {
        numbers = new ArrayList<>();
        String unsortedArray = "";
        String sortedArray = "";
        System.out.println("Enter the total number of integers for the arraylist to be sorted.");
        Scanner scan = new Scanner(System.in);
        int MAX = scan.nextInt();
        addNumbers(MAX);

        for(int n : numbers){
            unsortedArray += n + ", ";
        }
        System.out.print(unsortedArray.substring(0,unsortedArray.length()-2));
        System.out.println();

        for(int n : sortNumbers(numbers)){
            sortedArray += n + ", ";
        }
        System.out.print(sortedArray.substring(0,unsortedArray.length()-2));
    }

    public static void addNumbers(int x){
        for(int j = 0;j < x; j++){
            int num = (int)(Math.random() * 55) + 1;
            numbers.add(num);
        }
    }

    public static List<Integer> sortNumbers(List<Integer> n){
        for(int x = 0; x < n.size(); x++){
            for(int j = 0; j < n.size()-1; j++){
                if(n.get(j) > n.get(j+1)){
                    int temp = n.get(j);
                    n.set(j,n.get(j+1));
                    n.set(j+1,temp);

                }
            }
        }

        return n;
    }
}
