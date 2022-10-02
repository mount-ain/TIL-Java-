public class Unit {
    private int hp;
    private int power;
    private int shield;

    protected Unit() {
        this.hp = 50;
        this.power = 10;
        this.shield = 10;
    }

    protected int getHp() {
        return this.hp;
    }
    protected int getPower() {
        return this.power;
    }
    protected int getShield() {
        return this.shield;
    }
}
