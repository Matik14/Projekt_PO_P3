import java.util.List;

public class Main {

    //////////////////////////klasa
    public class Board {
        public Board(){
            //dokończ
        }
        //////////////////////////////////////////////
        void setupBoard() {
            //dokończ
        }
        //////////////////////////////////////////////
        Unit getUnit(int x, int y) {
            //dokończ
        }
        //////////////////////////////////////////////
        Terrain getTerrain(int x, int y) {
            //dokończ
        }
        //////////////////////////////////////////////
        void setTerrain(int x, int y, Terrain terrain) {

        }
        //////////////////////////////////////////////
        void moveUnit(int fromX, int fromY, int toX, int toY) {
            //dokończ
        }
        //////////////////////////////////////////////
        List<Unit> getUnitsInRange(int x, int y, int range) {
            //dokończ
        }
        //////////////////////////////////////////////
        List<Terrain> getTerrainInRange(int x, int y, int range) {
            //dokończ
        }
        //////////////////////////////////////////////
        boolean isObstacle(int x, int y) {
            //dokończ
        }
        //////////////////////////////////////////////
        boolean isAdjacent(int x1, int y1, int x2, int y2) {
            //dokończ
        }
        //////////////////////////////////////////////
        boolean isInRange(int x1, int y1, int x2, int y2, int range) {
            //dokończ
        }
        //////////////////////////////////////////////
        boolean isOccupied(int x, int y) {
            //dokończ
        }
        //////////////////////////////////////////////
        boolean isWithinBounds(int x, int y) {
            //dokończ
        }
        //////////////////////////////////////////////







    }
    /////////////////////////klasa
    public class Unit {
        public Unit() {
            //dokończ
        }
        //////////////////////////////////////////////
        int getAttack(){
            //dokończ
        }
        //////////////////////////////////////////////
        int getDefense(){
            //dokończ
        }
        //////////////////////////////////////////////
        int getHealth(){
            //dokończ
        }
        //////////////////////////////////////////////
        int getMaxHealth(){
            //dokończ
        }
        //////////////////////////////////////////////
        int getMovement(){
            //dokończ
        }
        //////////////////////////////////////////////
        int getRange(){
            //dokończ
        }
        //////////////////////////////////////////////
        void setHealth(int health){
            //dokończ
        }
        //////////////////////////////////////////////
        void setMaxHealth(int maxHealth){
            //dokończ
        }
        //////////////////////////////////////////////
        void setAttack(int attack){
            //dokończ
        }
        //////////////////////////////////////////////
        void setDefense(int defense){
            //dokończ
        }
        //////////////////////////////////////////////
        void setMovement(int movement){
            //dokończ
        }
        //////////////////////////////////////////////
        void setRange(int range){
            //dokończ
        }
        //////////////////////////////////////////////
        void attack(Unit target){
            //dokończ
        }
        //////////////////////////////////////////////
        boolean isAlive(){
            //dokończ
        }
        //////////////////////////////////////////////
        boolean canAttack(Unit target){
            //dokończ
        }
        //////////////////////////////////////////////
        boolean canMove(int x, int y){
            //dokończ
        }
        //////////////////////////////////////////////
        List<Unit> getUnitsInRange(int range){
            //dokończ
        }
        //////////////////////////////////////////////
        List<Terrain> getTerrainInRange(int range){
            //dokończ
        }
        //////////////////////////////////////////////



    }
    /////////////////////////klasa
    public class Character {
        private String name;
        private int attack;
        private int defense;
        private int spellPower;
        private int knowledge;
        private int gold;
        private int movementPoints;
        private int experience;
        private int level;
        private int spellPoints;
        private int morale;
        private int luck;

        public Character(String name, int attack, int defense, int spellPower, int knowledge, int gold, int movementPoints, int experience, int level, int spellPoints, int morale, int luck) {
            this.name = name;
            this.attack = attack;
            this.defense = defense;
            this.spellPower = spellPower;
            this.knowledge = knowledge;
            this.gold = gold;
            this.movementPoints = movementPoints;
            this.experience = experience;
            this.level = level;
            this.spellPoints = spellPoints;
            this.morale = morale;
            this.luck = luck;
        }
        //////////////////////////////////////////////
        String getName(){
            return name;
        }
        //////////////////////////////////////////////
        int getAttack(){
            return attack;
        }
        //////////////////////////////////////////////
        int getDefense(){
            return defense;
        }
        //////////////////////////////////////////////
        int getSpellPower(){
            return spellPower;
        }
        //////////////////////////////////////////////
        int getKnowledge(){
            return knowledge;
        }
        //////////////////////////////////////////////
        int getGold(){
            return gold;
        }
        //////////////////////////////////////////////
        int getMovementPoints(){
            return movementPoints;
        }
        //////////////////////////////////////////////
        int getExperience(){
            return experience;
        }
        //////////////////////////////////////////////
        int getLevel(){
            return level;
        }
        //////////////////////////////////////////////
        int getSpellPoints(){
            return spellPoints;
        }
        //////////////////////////////////////////////
        int getMorale(){
            return morale;
        }
        //////////////////////////////////////////////
        int getLuck(){
            return luck;
        }
        //////////////////////////////////////////////
        List<Unit> getArmy(){
            //dokończ
        }
        //////////////////////////////////////////////
        void setName(String name){
            this.name = name;
        }
        //////////////////////////////////////////////
        void setAttack(int attack){
            this.attack = attack;
        }
        //////////////////////////////////////////////
        void setDefense(int defense){
            this.defense = defense;
        }
        //////////////////////////////////////////////
        void setSpellPower(int spellPower){
            this.spellPower = spellPower;
        }
        //////////////////////////////////////////////
        void setKnowledge(int knowledge){
            this.knowledge = knowledge;
        }
        //////////////////////////////////////////////
        void setGold(int gold){
            this.gold = gold;
        }
        //////////////////////////////////////////////
        void setMovementPoints(int movementPoints){
            this.movementPoints = movementPoints;
        }
        //////////////////////////////////////////////
        void setExperience(int experience){
            this.experience = experience;
        }
        //////////////////////////////////////////////
        void setLevel(int level){
            this.level = level;
        }
        //////////////////////////////////////////////
        void setSpellPoints(int spellPoints){
            this.spellPoints = spellPoints;
        }
        //////////////////////////////////////////////
        void setMorale(int morale){
            this.morale = morale;
        }
        //////////////////////////////////////////////
        void setLuck(int luck){
            this.luck = luck;
        }
        //////////////////////////////////////////////
        void addToArmy(Unit unit){
            //dokończ
        }
        //////////////////////////////////////////////
        void removeFromArmy(Unit unit){
            //dokończ
        }
        //////////////////////////////////////////////





    }
    /////////////////////////klasa
    public class Terrain {
        public Terrain() {
            //dokończ
        }
        //////////////////////////////////////////////
        String getName(){
            //dokończ
        }
        //////////////////////////////////////////////
        int getMovementCost(){
            //dokończ
        }
        //////////////////////////////////////////////
        boolean isPassable(){
            //dokończ
        }
        //////////////////////////////////////////////
        boolean isObstructed(){
            //dokończ
        }
        //////////////////////////////////////////////
        boolean isStackable(){
            //dokończ
        }
        //////////////////////////////////////////////
        void setName(String name){
            //dokończ
        }
        //////////////////////////////////////////////
        void setMovementCost(int cost){
            //dokończ
        }
        //////////////////////////////////////////////
        void setPassable(boolean passable){
            //dokończ
        }
        //////////////////////////////////////////////
        void setObstructed(boolean obstructed){
            //dokończ
        }
        //////////////////////////////////////////////
        void setStackable(boolean stackable){
            //dokończ
        }
        //////////////////////////////////////////////
        void addUpgrade(Upgrade upgrade){
            //dokończ
        }
        //////////////////////////////////////////////
        List<Upgrade> getUpgrades(){
            //dokończ
        }
        //////////////////////////////////////////////
    }
    /////////////////////////klasa
    public class Shop {
        public Shop() {
        //dokończ
        }
        //////////////////////////////////////////////
        String getName(){
            //dokończ
        }
        //////////////////////////////////////////////
        void setName(String name){
            //dokończ
        }
        //////////////////////////////////////////////
        List<Item> getItems(){
            //dokończ
        }
        //////////////////////////////////////////////
        void setItems(List<Item> items){
            //dokończ
        }
        //////////////////////////////////////////////
        void addItem(Item item){
            //dokończ
        }
        //////////////////////////////////////////////
        void removeItem(Item item){
            //dokończ
        }
        //////////////////////////////////////////////
        void buyItem(Hero hero, Item item){
            //dokończ
        }
        //////////////////////////////////////////////
        void sellItem(Hero hero, Item item){
            //dokończ
        }
        //////////////////////////////////////////////
        int getGold(){
            //dokończ
        }
        //////////////////////////////////////////////
        void setGold(int gold){
            //dokończ
        }
        //////////////////////////////////////////////
    }
    /////////////////////////klasa
    public class NPC {
        public NPC() {
            //dokończ
        }
        //////////////////////////////////////////////
        String getName(){
            //dokończ
        }
        //////////////////////////////////////////////
        void setName(String name){
            //dokończ
        }
        //////////////////////////////////////////////
        List<Quest> getQuests(){
            //dokończ
        }
        //////////////////////////////////////////////
        void setQuests(List<Quest> quests){
            //dokończ
        }
        //////////////////////////////////////////////
        void addQuest(Quest quest){
            //dokończ
        }
        //////////////////////////////////////////////
        void removeQuest(Quest quest){
            //dokończ
        }
        //////////////////////////////////////////////
        void interact(Hero hero){
            //dokończ
        }
        //////////////////////////////////////////////
        String getDialogue(){
            //dokończ
        }
        //////////////////////////////////////////////
        void setDialogue(String dialogue){
            //dokończ
        }
        //////////////////////////////////////////////
        List<Item> getItems(){
            //dokończ
        }
        //////////////////////////////////////////////
        void addItem(Item item){
            //dokończ
        }
        //////////////////////////////////////////////
        void removeItem(Item item){
            //dokończ
        }
        //////////////////////////////////////////////
        int getGold(){
            //dokończ
        }
        //////////////////////////////////////////////
        void setGold(int gold){
            //dokończ
        }
        //////////////////////////////////////////////
    }
    /////////////////////////klasa
    public class Player {
        private String name;
        private int gold;

        public Player(String name, int gold) {
            this.name = name;
            this.gold = gold;
        }
        //////////////////////////////////////////////
        String getName(){
            return name;
        }
        //////////////////////////////////////////////
        void setName(String name){
            this.name = name;
        }
        //////////////////////////////////////////////
        int getGold(){
            return gold;
        }
        //////////////////////////////////////////////
        void setGold(int gold){
            this.gold = gold;
        }
        //////////////////////////////////////////////
        List<Hero> getHeroes(){
            //dokończ
        }
        //////////////////////////////////////////////
        void setHeroes(List<Hero> heroes){
            //dokończ
        }
        //////////////////////////////////////////////
        void addHero(Hero hero){
            //dokończ
        }
        //////////////////////////////////////////////
        void removeHero(Hero hero){
            //dokończ
        }
        //////////////////////////////////////////////
        void addGold(int gold){
            //dokończ
        }
        //////////////////////////////////////////////
        void subtractGold(int gold){
            //dokończ
        }
        //////////////////////////////////////////////
        int getTotalIncome(){
            //dokończ
        }
        //////////////////////////////////////////////
        int getTotalExpenses(){
            //dokończ
        }
        //////////////////////////////////////////////
        int getNetIncome(){
            //dokończ
        }
        //////////////////////////////////////////////
        boolean hasDefeated(){
            //dokończ
        }
        //////////////////////////////////////////////
        void setDefeated(boolean defeated){
            //dokończ
        }
        //////////////////////////////////////////////
    }
    /////////////////////////klasa
    public class Battle {
        public Battle() {
            //dokończ
        }
        //////////////////////////////////////////////
        void start(){
            //dokończ
        }
        //////////////////////////////////////////////
        void end(){
            //dokończ
        }
        //////////////////////////////////////////////
        void simulate(){
            //dokończ
        }
        //////////////////////////////////////////////
        void setAttacker(Player player){
            //dokończ
        }
        //////////////////////////////////////////////
        void setDefender(Player player){
            //dokończ
        }
        //////////////////////////////////////////////
        void setTerrain(Terrain terrain){
            //dokończ
        }
        //////////////////////////////////////////////
        void setBattlefield(Board board){
            //dokończ
        }
        //////////////////////////////////////////////
        void setAttackerHeroes(List<Hero> heroes){
            //dokończ
        }
        //////////////////////////////////////////////
        void setDefenderHeroes(List<Hero> heroes){
            //dokończ
        }
        //////////////////////////////////////////////
        Player getAttacker(){
            //dokończ
        }
        //////////////////////////////////////////////
        Player getDefender(){
            //dokończ
        }
        //////////////////////////////////////////////
        Terrain getTerrain(){
            //dokończ
        }
        //////////////////////////////////////////////
        Board getBattlefield(){
            //dokończ
        }
        //////////////////////////////////////////////
        List<Hero> getAttackerHeroes(){
            //dokończ
        }
        //////////////////////////////////////////////
        List<Hero> getDefenderHeroes(){
            //dokończ
        }
        //////////////////////////////////////////////
    }
    /////////////////////////klasa

//Pomysł dla postaci: opcje walcz/idź/badaj/lecz
//`badaj` bada teren we mgle wokół gracza i odkrywa tylko tę część wokół niego
//Tereny różne, które dadzą każdej drużynie jakiegoś rodzaju ulepszenia



    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}