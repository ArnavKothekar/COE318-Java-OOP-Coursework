package coe318.lab1;

public class Resistor {

    private double r;
    private double v;

    public Resistor(double resistance) {
        r = resistance;
    }

    public double getResistance() {
        return r;
    }

    public double getVoltage() {
        return v;
    }

    public void setVoltage(double voltage) {
        if (voltage >= -50 && voltage <= 50){
            v = voltage;
        } else {
            System.out.println("Invalid Voltage");
        }
    }

    public double getCurrent() {
        return v/r;
    }

    public void setCurrent(double current) {
        if (current >= -5 && current <= 5){
            v = current*r;
        } else {
            System.out.println("Invalid Current");
        }
    }

    public double getPower() {
        return (v*v)/r;
    }
    
    public static void main(String[] args) {
        Resistor r1, r2;
        System.out.println("Creating a 50 Ohm resistor (r1)");
        r1 = new Resistor(50.0);
        System.out.println("Its resistance is "
                + r1.getResistance() + " Ohms");
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Its voltage is "
                + r1.getVoltage() + " Volts");
        System.out.println("Its power is "
                + r1.getPower() + " Watts");
        System.out.println("Creating a 100 Ohm resistor (r2)");
        r2 = new Resistor(100.0);
        System.out.println("Its resistance is "
                + r2.getResistance() + " Ohms");
        System.out.println("Setting r1's current to 10 Amps");
        r1.setCurrent(10.0);
        System.out.println("Setting r1's current to 2 Amps");
        r1.setCurrent(2.0);
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Its voltage is "
                + r1.getVoltage() + " Volts");
        System.out.println("Its power is "
                + r1.getPower() + " Watts");
        System.out.println("Setting r1's voltage to 90 Volts");
        r1.setVoltage(90.0);
        System.out.println("Setting r1's voltage to 50 Volts");
        r1.setVoltage(50.0);
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Setting r2's current to 3 Amps");
        r2.setCurrent(3.0);
        System.out.println("Its voltage is "
                + r2.getVoltage() + " Volts");
    }
}

