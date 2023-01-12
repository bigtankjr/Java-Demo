public class GreenFlag implements Chain{

    private Chain setNextInChain;

    @Override
    public void setNext(Chain c) {
        this.setNextInChain = c;
    }

    @Override
    public void process(Flag request) {
        if(request.getFlagColor().equalsIgnoreCase("GREEN")){
            System.out.println(request.getFlagColor() + " : Move forward "+ ((int)(Math.random()*7) + 1) + " steps.");
        }else{
            setNextInChain.process(request);
        }
    }
}
