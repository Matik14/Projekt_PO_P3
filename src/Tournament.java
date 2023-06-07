import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private String name;
    private List<Gladiator> participants;
    private boolean isStarted;
    private boolean isEnded;
    private Gladiator winner;

    public Tournament(String name) {
        this.name = name;
        this.participants = new ArrayList<>();
        this.isStarted = false;
        this.isEnded = false;
        this.winner = null;
    }

    public void addParticipant(Gladiator gladiator) {
        if (!isStarted && !isEnded) {
            participants.add(gladiator);
        }
    }

    public void start() {
        if (!isStarted && !isEnded && participants.size() >= 2) {
            System.out.println("Rozpoczyna się turniej " + name + "!");
            isStarted = true;
            // Logika rozgrywki turniejowej
        }
    }

    public void end() {
        if (isStarted && !isEnded) {
            isEnded = true;
            // Logika zakończenia turnieju, np. ogłoszenie zwycięzcy
            if (participants.size() == 1) {
                winner = participants.get(0);
                System.out.println("Turniej " + name + " zakończony! Zwycięzcą jest " + winner.getName() + "!");
            } else {
                System.out.println("Turniej " + name + " zakończony!");
            }
        }
    }

    public boolean isStarted() {
        return isStarted;
    }

    public boolean isEnded() {
        return isEnded;
    }

    public Gladiator getWinner() {
        return winner;
    }
}
