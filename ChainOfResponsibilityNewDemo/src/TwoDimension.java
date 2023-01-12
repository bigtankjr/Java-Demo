import java.util.Arrays;

public class TwoDimension implements Chain{
    public Chain setNextInChain;

    @Override
    public void process(Dimension dimension) {
        if(dimension.getCoordinates().length==2){
            System.out.println("Two Dimension" + Arrays.toString(dimension.getCoordinates()));
        }else{
            setNextInChain.process(dimension);
        }
    }

    @Override
    public void setNext(Chain c) {
        this.setNextInChain = c;
    }
}
