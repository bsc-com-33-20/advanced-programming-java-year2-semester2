public class CubeMain {
    public static void main(String[] args){
        Cube CB = new Cube(4);

        System.out.println("A cube with length " + CB.getLength() + " has a Surface area of "
                + CB.SurfaceArea() + "\n and a volume of " + CB.Volume());
    }
}
