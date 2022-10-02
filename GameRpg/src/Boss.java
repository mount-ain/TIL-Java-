public class Boss extends Unit {
    private Map map = new Map(1);

    public int getHp() {
        return super.getHp() * map.getStage() * 2;
    }
    public int getPower() {
        return super.getPower() * map.getStage() * 2;
    }
    public int getShield() {
        return super.getShield() * map.getStage() * 2;
    }
    public int getStage() {
        return map.getStage();
    }
}
