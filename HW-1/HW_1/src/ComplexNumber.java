public class ComplexNumber {
    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public void add(ComplexNumber other){
        real+=other.real;
        imaginary+=other.imaginary;
    }

    public void add(double real,double imaginary){
        add(new ComplexNumber(real,imaginary));
    }

    public void substract(ComplexNumber other){
        real-=other.real;
        imaginary-=other.imaginary;
    }

    public void substract(double real,double imaginary){
        substract(new ComplexNumber(real,imaginary));
    }
}
