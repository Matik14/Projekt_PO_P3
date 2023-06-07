public class Weapon {
    private String name;
    private int attackDamage;
    private int range;

    public Weapon(String name, int attackDamage, int range) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.range = range;
    }

    public String getName() {
        return name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getRange() {
        return range;
    }
}
