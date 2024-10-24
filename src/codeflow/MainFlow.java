package codeflow;

public class MainFlow {

    public static void main(String[] args) {
        codeflow.Flows flows = new codeflow.Flows();
        //System.out.println("flows.alphaA(\"start\");");
        flows.alphaA("start");
        // System.out.println("flows.alphaB(\"Hello, world\");");
        flows.alphaB("Hello, world");
        System.out.println(flows.alphaC("e"));
        // flows.alphaC("Hello, world");
        //System.out.println("flows.alphaD(25);");
        flows.alphaD(6);

        // Jeg er ikke sikker på outputtet er korrekt... Der kommer et 1 tal med i fx.
    }
}
