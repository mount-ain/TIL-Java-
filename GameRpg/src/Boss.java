public class Boss extends Unit{
    private Map map = new Map(1);

    public int getHp() {
        return super.hp * map.getStage() * 2;
    }
    public int getPower() {
        return super.power * map.getStage() * 2;
    }
    public int getShield() {
        return super.shield * map.getStage() * 2;
    }
    public int getStage() {
        return map.getStage();
    }
}
