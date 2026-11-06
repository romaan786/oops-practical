class ComplexNumber {
    int real;
    int imaginary;
    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    ComplexNumber add(ComplexNumber other) {
        int newReal = this.real + other.real;
        int newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}
public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(2, 5);
        ComplexNumber result = c1.add(c2);
        System.out.print("First number  : ");
        c1.display();
        System.out.print("Second number : ");
        c2.display();
        System.out.print("Sum: ");
        result.display();
    }
}