public class Boon {
    private int water;

    public Boon () {
        this.water = water;
    }

    public int getWater() {
        return this.water;
    }

    public void fillWater(int water) {
        this.water += water;
        System.out.printf("water charged. water remained %dL.\n", this.water);
    }

    public void shootWater(Flower flower) {
        if (this.water > 0) {
            this.water -= 1;
            flower.plusHumidity();
            System.out.printf("water remained %dL.\n", this.water);
        }
        else System.out.println("out of water. please fill water");
    }
}
