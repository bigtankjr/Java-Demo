import java.util.Arrays;

public class ThreeDimension implements Chain{

    private Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        this.nextInChain=c;
    }

    @Override
    public void process(Dimension request) {
        if(request.getCoordinates().length==3){
            System.out.println("Three Dimension: " + Arrays.toString(request.getCoordinates()));
        }else{
            System.out.println("Outside of expected dimensions.");
        }
    }
}
