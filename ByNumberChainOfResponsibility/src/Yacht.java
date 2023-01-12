public class Yacht implements Chain{

    private Chain nextInChain;

    @Override
    public void process(Boat request) {
        if(request.getBoatNumber()==56){
            System.out.println("The Yacht is next to dock: " + request.getBoatNumber());
        }else{
            System.out.println("No boat found with the number: " + request.getBoatNumber());
        }
    }

    @Override
    public void setNext(Chain c) {
        nextInChain=c;
    }
}
