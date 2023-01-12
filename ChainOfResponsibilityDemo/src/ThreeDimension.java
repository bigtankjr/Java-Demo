import java.util.Arrays;

public class ThreeDimension implements Chain {

    private Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void process(Dimension request) {
        if(request.getCoordinate().length==3){
            System.out.println("ThreeDimension coordinate: " + Arrays.toString(request.getCoordinate()));
        }else{
            System.out.println("Not supported");
        }
    }


}
