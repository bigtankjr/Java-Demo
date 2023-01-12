import java.util.Arrays;

public class OneDimension implements Chain{
    public Chain setNextInChain;

    @Override
    public void process(Dimension dimension) {
        if(dimension.getCoordinates().length==1){
            System.out.println("One Dimension" + Arrays.toString(dimension.getCoordinates()));
        }else{
            setNextInChain.process(dimension);
        }
    }

    @Override
    public void setNext(Chain c) {
        this.setNextInChain = c;
    }
}
