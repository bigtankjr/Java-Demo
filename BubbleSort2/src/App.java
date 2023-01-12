import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class App {
    static String ERROR = "THIS WON'T WORK ERROR!!!!!";
    public static void main(String[] args) {

        JOptionPane jop = new JOptionPane();
        jop.showMessageDialog(null,"Hello World");
        String code = jop.showInputDialog("Hit okay to proceed");
        List numberList;
        numberList = add(new ArrayList<Integer>());

        if(code.equalsIgnoreCase("trigger"))
            jop.showMessageDialog(null,ERROR,"Error Message",JOptionPane.ERROR_MESSAGE);

        //Collections.sort(numberList);

        for(Object l: sortArray(numberList)){
            System.out.print(l.toString() + ", ");
        }
    }

    public static List<Integer> add( List<Integer> list){
        list.add(12);
        list.add(15);
        list.add(2);
        list.add(22);
        list.add(55);
        list.add(7);
        list.add(9);

        return list;

    }

    public static List<Integer> sortArray(List<Integer> list){

        for(int x = 0; x < list.size(); x++){
            for(int j = 0; j < list.size() -1; j++){
                if((list.get(j) >  list.get(j+1)) ){
                    Integer temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);

                }
            }

        }

        return list;
    }
}
