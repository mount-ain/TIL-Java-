public class Hero extends Unit{
    private Map map = new Map(1);
    private int currentStage = map.getStage();

    public void moveStage() {
        map.moveStage();
    }
    public void attack() {

    }
}
