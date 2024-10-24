package Task_2;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        //this.seats[0][0] = "X"; flyttet længere ned og udenfor for loopet
        this.seats = new String[rows][seats];
        // Initialize all seats to "O"
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                this.seats[i][j] = "O";
            }
        }
        this.seats[0][0] = ("X"); // sætter række 0 og sæde 0 til "X" for altid.
        // Der kaldes ikke på dette i Main, fordi det er for altid
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        if (seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) {
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        String result = ""; // ret fejl fra null til tom string for ellers ville der står null 1sæde 1række
        for (String[] seat : seats) {
            result += "|"; // intellje har et forslag - jeg kender ikke til Stringbiulder og bruger det derfor ikke
            for (String s : seat) {
                result += s + "|"; // intellje har et forslag - jeg kender ikke til Stringbiulder og bruger det derfor ikke
            }
            result += "\n";
        }
        return result;
    }
}
