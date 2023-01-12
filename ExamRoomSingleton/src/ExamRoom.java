public class ExamRoom {

    private static ExamRoom INSTANCE = null;

    private static int counter;

    private ExamRoom(){
        counter++;
    }

    public synchronized static ExamRoom getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ExamRoom();
        }

        return INSTANCE;
    }

    public void assessPatient(){
        System.out.println("The patient is in the room being assessed.");
    }

    public int getCounter(){

        return counter;
    }
}
