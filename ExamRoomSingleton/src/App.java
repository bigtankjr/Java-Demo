public class App {

    public static void main(String[] args) {
        ExamRoom room = ExamRoom.getInstance();
        room.assessPatient();
        System.out.println(room.getCounter());
    }
}
