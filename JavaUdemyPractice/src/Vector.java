public class Vector {
    public int x;
    public int y;
    public int z;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Vector(int x, int y, int z) {
        this(x,y);
        this.z = z;
    }


}
