public class Complex {
    int real;
    int image;
    Complex(){
        real = 0;
        image = 0;
    }
    Complex(int real, int image){
        this.real = real;
        this.image = image;
    }
    @Override
    public String toString(){
        return String.format("%d + (%d)i", real, image);
    }
}
