public class WebDriverAdpater implements WebDriver{
    @Override
    public void getElement() {
        ieDriver.findElement();
    }

    @Override
    public void selectElement() {
        ieDriver.clickElement();
    }

    IEDriver ieDriver;

    public WebDriverAdpater(IEDriver ieDriver){
        this.ieDriver = ieDriver;
    }
}
