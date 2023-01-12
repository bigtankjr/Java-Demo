public class RedFlag implements Chain{

    private Chain setNextInChain;

    @Override
    public void setNext(Chain c) {
        this.setNextInChain = c;
    }

    @Override
    public void process(Flag request) {
        if(request.getFlagColor().equalsIgnoreCase("RED")){
            System.out.println(request.getFlagColor() + " : Stop where you are.");
        }else{
            setNextInChain.process(request);
        }
    }
}
