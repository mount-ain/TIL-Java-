public class Flower {
    private int humidity;
    private int humidityOfDay;
    private boolean alive = true;

    public void plusHumidity() {
        this.humidity += 1;
        this.humidityOfDay += 1;
    }

    public void spendDay() {
        if (this.humidityOfDay < 3) {
            this.alive = false;
            System.out.println("humidity is not fulled. your flower is dead.");
        } else if (this.alive == false) System.out.println("your flower is already dead.");
        else System.out.println("humidity is fulled. your flower is alive.");
        this.humidityOfDay = 0;

    }
}
