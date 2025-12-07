public class SmartDevice{
    public static void main(String[] args) {
        SmartDevices s = new SmartDevices();
        s.makeCall();
        s.clickPhoto();
    }
}
class SmartDevices implements Camera, Phone  {
    public void clickPhoto(){
        System.out.println("Photo Clicked");
    }
    public void makeCall(){
        System.out.println("Making Call");
    }
}
interface Camera{
    void clickPhoto();
}
interface Phone{
    void makeCall();
}
