public class Battle {
    private Gladiator gladiator1;
    private Gladiator gladiator2;
    private boolean isOver;
    private Gladiator winner;

    public Battle(Gladiator gladiator1, Gladiator gladiator2) {
        this.gladiator1 = gladiator1;
        this.gladiator2 = gladiator2;
        this.isOver = false;
        this.winner = null;
    }

    public void start() {
        System.out.println("Rozpoczyna się walka pomiędzy " + gladiator1.getName() + " a " + gladiator2.getName() + "!");
    }

    public void performMove() {
        // Logika wykonywania ruchu w walce
        // Można uwzględnić różne czynniki, takie jak atak, obrona, trafienie, itp.
    }

    public void end() {
        isOver = true;
        // Logika zakończenia walki, np. ogłoszenie zwycięzcy
        if (gladiator1.getHealth() > 0 && gladiator2.getHealth() <= 0) {
            winner = gladiator1;
        } else if (gladiator1.getHealth() <= 0 && gladiator2.getHealth() > 0) {
            winner = gladiator2;
        }
        if (winner != null) {
            System.out.println("Walka zakończona! Zwycięzcą jest " + winner.getName() + "!");
        } else {
            System.out.println("Walka zakończona remisem!");
        }
    }

    public boolean isOver() {
        return isOver;
    }

    public Gladiator getWinner() {
        return winner;
    }
}
