public class SpeedBoat implements Chain{

    private Chain nextInChain;

    @Override
    public void process(Boat request) {
        if(request.getBoatNumber()==1){
            System.out.println("The Speed Boat is next to dock: " + request.getBoatNumber());
        }else{
            nextInChain.process(request);
        }
    }

    @Override
    public void setNext(Chain c) {
        nextInChain=c;
    }
}
