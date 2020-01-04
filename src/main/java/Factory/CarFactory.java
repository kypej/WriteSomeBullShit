package Factory;

public abstract class CarFactory {
    public void carPaint(){
        System.out.println("Покрасил машину в цвет");

        Car okCar = createCar();
        okCar.road();
    }

    public abstract Car createCar();
}
