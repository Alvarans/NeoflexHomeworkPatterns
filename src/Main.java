import bdproxy.DBProxy;
import coffeefactory.CoffeeMachine;
import coffeefactory.CoffeeType;
import singletonlogger.FirstTextClass;
import singletonlogger.SecondTestClass;
import singletonlogger.SingletonLogger;
import usbadapter.Computer;
import usbadapter.MemoryCard;
import usbadapter.MemoryCardAdapter;
import usbadapter.USB;

public class Main {
    public static void main(String[] args) {
        //Singleton pattern
        System.out.println("\nSingleton pattern");
        FirstTextClass testClass1 = new FirstTextClass();
        SecondTestClass testClass2 = new SecondTestClass();
        SingletonLogger.getInstance().log(testClass1, "there are some string information about class");
        SingletonLogger.getInstance().log(testClass2, "there are another string information");
        //Factory pattern
        System.out.println("\nFactory pattern");
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeCoffee(CoffeeType.ESPRESSO);
        coffeeMachine.makeCoffee(CoffeeType.AMERICANO);
        //Adapter pattern
        System.out.println("\nAdapter pattern");
        Computer computer = new Computer();
        MemoryCard memoryCard = new MemoryCard();
        USB usbCable = new USB();
        MemoryCardAdapter memoryCardAdapter = new MemoryCardAdapter(memoryCard);
        computer.readInfo(usbCable);
        computer.readInfo(memoryCardAdapter);
        //Proxy pattern
        System.out.println("\nProxy pattern");
        DBProxy dbProxy = new DBProxy();
        dbProxy.connect("mydatabase");
    }
}