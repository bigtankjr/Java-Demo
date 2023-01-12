import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String num = "";
        boolean valid = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number other than 0.");
        num = scan.nextLine();

        while(!num.equalsIgnoreCase("0")){
            valid = checkNum(num);
            if(!valid)
                System.out.println(num + " cannot be converted to a number.");
            else
                System.out.println(num + " can be converted to a number.");

            System.out.println("Enter a number other than 0.");
            num = scan.nextLine();
        }
    }

    public static boolean checkNum(String x){
        try {
            int y = Integer.parseInt(x);
            return true;
        }catch(Exception e){
            System.out.println(e.toString());
            return false;
        }

    }
}
