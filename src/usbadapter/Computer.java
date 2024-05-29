package usbadapter;

public class Computer {

    public void readInfo(USB usbCable) {
        System.out.println("Reading information from " + usbCable.set());
    }
}
