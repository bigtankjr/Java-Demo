import java.util.Arrays;

public class TwoDimension implements Chain{

    private Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        this.nextInChain=c;
    }

    @Override
    public void process(Dimension request) {
        if(request.getCoordinates().length==2){
            System.out.println("Two Dimension: " + Arrays.toString(request.getCoordinates()));
        }else{
            nextInChain.process(request);
        }
    }
}
