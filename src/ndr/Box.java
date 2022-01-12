package ndr;

class Box {
    double width;
    double heigth;
    double depth;


    Box (double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }

    Box (){

    }

    double getVolume() {
        return width * heigth * depth;
    }


    void setDim (double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }

    void setDim (int width, int heigth, int depth) {
        this.width = width;
        this.heigth = heigth;
        this.depth = depth;
    }
}