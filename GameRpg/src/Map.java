public class Map {
    private static int stage;

    //constructor
    public Map(int stage) {
        Map.stage = stage;
    }

    public static int getStage() {
        return Map.stage;
    }
    public void moveStage() {
        Map.stage += 1;
    }
}
