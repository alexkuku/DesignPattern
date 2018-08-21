package observer;

/**
 * 测试类
 */
public class WheaterStation {

    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);

        System.out.println("System start...");
        Thread.sleep(5000);
        System.out.println("get an information");
        Thread.sleep(1000);
        weatherData.setMeasurements(80,80,90);
        Thread.sleep(5000);
        System.out.println("get an information");
        Thread.sleep(1000);
        weatherData.setMeasurements(70,90, 100);
        
    }




}
