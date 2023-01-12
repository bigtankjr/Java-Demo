public class Dimension {

    private int[] coordinates;

    public int[] getCoordinates() {
        return coordinates;
    }

    public Dimension(int x){
        coordinates = new int[]{x};
    }

    public Dimension(int x, int y){
        coordinates = new int[]{x,y};
    }

    public Dimension(int x, int y , int z){
        coordinates = new int[]{x,y,z};
    }
}
