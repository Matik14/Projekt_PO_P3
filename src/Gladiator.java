import java.util.List;

public class Gladiator {
    private String name;
    private int strength;
    private int agility;
    private int endurance;
    private int health;
    private int level;
    private int experience;

    public Gladiator(String name, int strength, int agility, int endurance) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.endurance = endurance;
        this.health = calculateMaxHealth();
        this.level = 1;
        this.experience = 0;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public void attack(Gladiator opponent) {
        // Logika ataku
    }

    public void defend(int damage) {
        // Logika obrony
    }

    public void increaseExperience(int amount) {
        experience += amount;
        // Logika zwiększania poziomu, jeśli wystarczająco dużo doświadczenia
    }

    private int calculateMaxHealth() {
        // Logika obliczania maksymalnego zdrowia na podstawie statystyk
        return 0;   //do zmiany
    }

    public int getWins() {

        return 0;   //do zmiany
    }
}
