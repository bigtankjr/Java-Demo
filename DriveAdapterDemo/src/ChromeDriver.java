public class ChromeDriver implements Driver{
    @Override
    public void getConnection() {
        System.out.println("Getting ChromeDriver connection.");
    }

    @Override
    public void selectConnection() {
        System.out.println("ChromeDriver connection selected.");
    }
}
