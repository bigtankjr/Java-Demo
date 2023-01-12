import java.util.Arrays;

public class OneDimension implements Chain{

    private Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        this.nextInChain=c;
    }

    @Override
    public void process(Dimension request) {
        if(request.getCoordinates().length==1){
            System.out.println("One Dimension: " + Arrays.toString(request.getCoordinates()));
        }else{
            nextInChain.process(request);
        }
    }
}
