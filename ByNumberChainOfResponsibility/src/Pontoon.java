public class Pontoon implements Chain{

    private Chain nextInChain;

    @Override
    public void process(Boat request) {
        if(request.getBoatNumber()==12){
            System.out.println("The Pontoon is next to dock: " + request.getBoatNumber());
        }else{
            nextInChain.process(request);
        }
    }

    @Override
    public void setNext(Chain c) {
        nextInChain=c;
    }
}
