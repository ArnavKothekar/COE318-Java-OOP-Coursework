package coe318.lab8;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Circuit circuit = Circuit.getCircuit();
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (!sc.hasNext()) break;
            String cmd = sc.next();
            switch (cmd.toLowerCase()){
                case "r":
                    int node1 = sc.nextInt();
                    int node2 = sc.nextInt();
                    double resistance = sc.nextDouble();
                    circuit.add(new Resistor(node1, node2, resistance));
                    break;
                case "v":
                    int positiveNode = sc.nextInt();
                    int negativeNode = sc.nextInt();
                    double voltage = sc.nextDouble();
                    circuit.add(new VoltageSource(positiveNode, negativeNode, voltage));
                    break;
                case "spice":
                    System.out.print(circuit.toSpice());
                    break;
                case "end":
                    System.out.println("All Done");
                    return;
                default:
                    System.out.println("Unknown Command; Valid Options: 'r', 'v', 'spice', 'end'");
            }
        }
    }
}
