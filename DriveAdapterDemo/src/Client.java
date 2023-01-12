public class Client {

    public static void main(String[] args) {
        Driver chrome = new ChromeDriver();
        chrome.getConnection();
        chrome.selectConnection();

        System.out.println();

        IEDriver ie = new IEDriver();
        Driver usb = new USBDriver(ie);
        usb.getConnection();
        usb.selectConnection();
    }
}
