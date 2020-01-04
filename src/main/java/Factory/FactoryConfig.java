package Factory;

public class FactoryConfig {

    private static CarFactory carFactory;

    public FactoryConfig(String conf) {
        configure(conf);
    }

    private void configure(String conf){
        if (conf.equals("fast")){
            carFactory = new HondaFactory();
        } else
        if (conf.equals("drift")) {
            carFactory = new MercedesFactory();
        }
    }

    public void start(){
        carFactory.carPaint();
    }
}
