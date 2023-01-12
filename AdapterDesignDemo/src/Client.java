public class Client {

    public static void main(String[] args) {
        IEDriver e = new IEDriver();
        WebDriver webDriver = new WebDriverAdpater(e);

        webDriver.getElement();
        webDriver.selectElement();

        System.out.println();

        WebDriver chrome = new ChromeDriver();
        chrome.getElement();
        chrome.selectElement();
    }
}
