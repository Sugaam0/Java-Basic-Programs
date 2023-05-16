package BasicPrograms;
//Java Program to Add Two Complex numbers

public class Complex {
        int real, img;

        public Complex(int real, int img)
            {
                this.real = real;
                this.img = img;
            }

        public static Complex add(Complex r1, Complex r2)  
            {
                Complex c1 = new Complex(0,0);
                c1.real = r1.real + r2.real;
                c1.img = r1.img + r2.img;
    
                return c1;
            }
         public void display()
            {
                System.out.println("real value = " + this.real + "imaginary value = " + this.img);
            }

    public static void main(String[] args)
        {
            Complex c1 = new Complex(2,3);
            c1.display();
            Complex c2 = new Complex(4,5);
            c2.display();
            Complex c3;

            c3 = add(c1, c2);
            c3.display();

        }
}

