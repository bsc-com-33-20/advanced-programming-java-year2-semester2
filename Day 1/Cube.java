public class Cube {
    private int length;

    public Cube(int length) {

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int SurfaceArea(){
        int SurfaceArea = 0;
        if(this.length < 1){
            this.length = 0;
        }else {
            SurfaceArea = 6*((this.length) * (this.length));
        }
        return SurfaceArea;
    }

    public int Volume(){
        int Volume =0;
        if(this.length < 1){
            this.length = 0;
        }else {
            Volume = ((this.length)* (this.length) * (this.length));
        }
        return Volume;
    }
}




