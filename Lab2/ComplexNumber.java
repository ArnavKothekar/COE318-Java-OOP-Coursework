package coe318.lab2;

public class ComplexNumber {
    private double realComp, imagComp;

    public ComplexNumber(double re, double im) {
        this.realComp = re;
        this.imagComp = im;
    }

    public double getReal() {
        return realComp;
    }

    public double getImaginary() {
        return imagComp;
    }

    public ComplexNumber negate() {
        return new ComplexNumber(-realComp, -imagComp);
    }

    public ComplexNumber add(ComplexNumber z) {
        return new ComplexNumber(this.realComp + z.realComp, this.imagComp + z.imagComp);
    }

    public ComplexNumber subtract(ComplexNumber z) {
        return new ComplexNumber(this.realComp - z.realComp, this.imagComp - z.imagComp);
    }

    public ComplexNumber multiply(ComplexNumber z) {
        return new ComplexNumber(
            this.realComp * z.realComp - this.imagComp * z.imagComp, 
            this.imagComp * z.realComp + this.realComp * z.imagComp);
    }

    public ComplexNumber reciprocal() {
        double denominator = this.realComp * this.realComp + this.imagComp * this.imagComp;
        return new ComplexNumber(this.realComp/denominator, -this.imagComp/denominator);
    }

    public ComplexNumber divide(ComplexNumber z) {
        double denominator = z.realComp * z.realComp + z.imagComp * z.imagComp;
        double realNum = this.realComp * z.realComp + this.imagComp * z.imagComp;
        double imagNum = this.imagComp * z.realComp - this.realComp * z.imagComp;
        return new ComplexNumber(realNum/denominator, imagNum/denominator);
    }

    @Override
    public String toString() {
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}


