import java.util.ArrayList;
import java.util.List;

public class Game {
    private Arena arena;
    private List<Tournament> tournaments;

    public Game() {
        this.arena = new Arena();
        this.tournaments = new ArrayList<>();
    }

    public void addGladiator(Gladiator gladiator) {
        arena.addGladiator(gladiator);
    }

    public void startBattle() {
        arena.startNewBattle();
    }

    public void performMove() {
        arena.performMove();
    }

    public void endBattle() {
        arena.endCurrentBattle();
    }

    public void addTournament(Tournament tournament) {
        tournaments.add(tournament);
        arena.addTournament(tournament);
    }

    public void startTournament(Tournament tournament) {
        arena.startTournament(tournament);
    }

    public void endTournament(Tournament tournament) {
        arena.endTournament(tournament);
    }
}
