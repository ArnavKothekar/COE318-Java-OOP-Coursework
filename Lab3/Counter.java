package coe318.lab3;

public class Counter {

    private int modulus, digit;
    Counter left;

    public Counter(int modulus, Counter left) {
        this.modulus = modulus;
        this.digit = 0;
        this.left = left;
    }

    public int getModulus() {
        return this.modulus;
    }

    public Counter getLeft() {
        return this.left;
    }

    public int getDigit() {
        return this.digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

    public void increment() {
        this.digit++;
        if (this.digit >= this.modulus){
            this.digit = 0;
            if (this.left != null){
                this.left.increment();
            }
        }
    }

    public int getCount() {
        if (this.left != null){
            return this.digit + this.modulus * this.left.getCount();
        } else {
            return this.digit;
        }
    }
    
    @Override
    public String toString() {
        return "" + getCount();
    }
}

