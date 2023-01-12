import java.util.Arrays;

public class OneDimension implements Chain {

    private Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void process(Dimension request) {
        if(request.getCoordinate().length==1){
            System.out.println("OneDimension coordinate: " + Arrays.toString(request.getCoordinate()));
        }else{
            nextInChain.process(request);
        }
    }


}
