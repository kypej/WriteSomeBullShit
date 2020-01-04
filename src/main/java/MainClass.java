import Decorator.Dog;
import Decorator.HomeDogDecorator;
import Decorator.HomelessDogDecorator;
import Factory.*;

public class MainClass {

    public static void main(String[] args) {

        /**
         * Декоратор
         */
        HomeDogDecorator homeDog = new HomeDogDecorator(new Dog());
        homeDog.go();
        homeDog.speak();
        homeDog.giveTapochki();

        HomelessDogDecorator homelessDog = new HomelessDogDecorator(new Dog());
        homelessDog.bite();

        /**
         * Фабрика
         */
        String honda = "fast";
        String mercedes = "drift";

        FactoryConfig factoryConfigMercedec = new FactoryConfig(mercedes);
        factoryConfigMercedec.start();

        FactoryConfig factoryConfigHonda = new FactoryConfig(honda);
        factoryConfigHonda.start();

    }
}
