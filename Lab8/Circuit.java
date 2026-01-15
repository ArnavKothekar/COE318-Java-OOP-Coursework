package coe318.lab8;
import java.util.ArrayList;

public class Circuit {

    private static Circuit circuit = new Circuit();
    private ArrayList<Component> components;
    
    private Circuit() {
        components = new ArrayList<>();
    }

    public static Circuit getCircuit() {
        return circuit;
    }

    public void add(Component component) {
        components.add(component);
    }

    public int getSize() { 
        return components.size(); 
    }
    
    public String toSpice() {
        String result = "";
        int rcount = 1;
        int vcount = 1;
        for (Component c : components) {
            if (c instanceof Resistor) {
                result += "R" + rcount + " " + c.node1 + " " + c.node2 + " " + c.value + "\n";
                rcount++;
            }
            else if (c instanceof VoltageSource) {
                result += "V" + vcount + " " + c.node1 + " " + c.node2 + " DC " + c.value + "\n";
                vcount++;
            }
        }
        return result;
    }
}
