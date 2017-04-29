package classes;

import soong.Output;

public class OutputFactory {

    public Output getOutput() {
        // return new Printer();
        return new BetterPrinter();
    }

    public static void main(String[] args) {
        OutputFactory of = new OutputFactory();
        Computer c = new Computer(of.getOutput());
        c.keyIn("佛教十三经");
        c.keyIn("佛教十五题");
        c.print();
    }
}
