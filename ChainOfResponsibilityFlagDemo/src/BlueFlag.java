public class BlueFlag implements Chain{

    private Chain setNextInChain;

    @Override
    public void setNext(Chain c) {
        this.setNextInChain = c;
    }

    @Override
    public void process(Flag request) {
        if(request.getFlagColor().equalsIgnoreCase("BLUE")){
            System.out.println(request.getFlagColor() + " : Move to the left "+ ((int)(Math.random()*7) + 1) + " steps.");
        }else{
            setNextInChain.process(request);
        }
    }
}
