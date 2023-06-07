import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Gladiator> gladiators;
    private Battle currentBattle;
    private List<Tournament> tournaments;
    private List<Gladiator> ranking;

    public Arena() {
        this.gladiators = new ArrayList<>();
        this.currentBattle = null;
        this.tournaments = new ArrayList<>();
        this.ranking = new ArrayList<>();
    }

    public void addGladiator(Gladiator gladiator) {
        gladiators.add(gladiator);
    }

    public void startNewBattle() {
        if (gladiators.size() < 2) {
            System.out.println("Nie ma wystarczającej liczby gladiatorów do rozpoczęcia walki.");
            return;
        }

        Gladiator gladiator1 = getRandomGladiator();
        Gladiator gladiator2 = getRandomGladiator();

        currentBattle = new Battle(gladiator1, gladiator2);
        currentBattle.start();
    }

    public void performMove() {
        if (currentBattle != null) {
            currentBattle.performMove();
        }
    }

    public void endCurrentBattle() {
        if (currentBattle != null) {
            currentBattle.end();
            Gladiator winner = currentBattle.getWinner();
            if (winner != null) {
                updateRanking(winner);
            }
            currentBattle = null;
        }
    }

    public void addTournament(Tournament tournament) {
        tournaments.add(tournament);
    }

    public void startTournament(Tournament tournament) {
        if (tournaments.contains(tournament)) {
            tournament.start();
        } else {
            System.out.println("Turniej nie istnieje.");
        }
    }

    public void endTournament(Tournament tournament) {
        if (tournaments.contains(tournament)) {
            tournament.end();
        } else {
            System.out.println("Turniej nie istnieje.");
        }
    }

    public void updateRanking(Gladiator gladiator) {
        ranking.add(gladiator);
        ranking.sort((g1, g2) -> Integer.compare(g2.getWins(), g1.getWins())); // Sortowanie w oparciu o ilość wygranych walk
    }

    private Gladiator getRandomGladiator() {
        int index = (int) (Math.random() * gladiators.size());
        return gladiators.get(index);
    }
}
