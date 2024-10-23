package codeflow;

public class Flows {
    public void alphaA(String input) {
        System.out.println(" J ");
        if (!input.equals(" start ")) {
            System.out.println(" a ");
            alphaB(" start ");
        } else {
            System.out.println(" a ");
            System.out.println(alphaC(input));
        }
        System.out.println(" a ");
    }

    public void alphaB(String start) {
        System.out.println(" v ");
    }

    public int alphaC(String input) {
        System.out.println(" e ");
        alphaD(input.length());
        return input.length();
    }

    public void alphaD(int number) {
        System.out.println(" r ");
        if (number > 5) {
            System.out.println("  ");
        }
        System.out.println("s " + " j " + " o " + " v "+ " t ");
    }
}

