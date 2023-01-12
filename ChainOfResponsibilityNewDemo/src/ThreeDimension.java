import java.util.Arrays;

public class ThreeDimension implements Chain{
    public Chain setNextInChain;

    @Override
    public void process(Dimension dimension) {
        if(dimension.getCoordinates().length==3){
            System.out.println("Three Dimension" + Arrays.toString(dimension.getCoordinates()));
        }else{
            System.out.println("Error in chain.");
        }
    }

    @Override
    public void setNext(Chain c) {
        this.setNextInChain = c;
    }
}
