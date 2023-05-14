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
        public Character() {
            //dokończ
        }
        //////////////////////////////////////////////
        String getName(){
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
        int getSpellPower(){
            //dokończ
        }
        //////////////////////////////////////////////
        int getKnowledge(){
            //dokończ
        }
        //////////////////////////////////////////////
        int getGold(){
            //dokończ
        }
        //////////////////////////////////////////////
        int getMovementPoints(){
            //dokończ
        }
        //////////////////////////////////////////////
        int getExperience(){
            //dokończ
        }
        //////////////////////////////////////////////
        int getLevel(){
            //dokończ
        }
        //////////////////////////////////////////////
        int getSpellPoints(){
            //dokończ
        }
        //////////////////////////////////////////////
        int getMorale(){
            //dokończ
        }
        //////////////////////////////////////////////
        int getLuck(){
            //dokończ
        }
        //////////////////////////////////////////////
        List<Unit> getArmy(){
            //dokończ
        }
        //////////////////////////////////////////////
        void setName(String name){
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
        void setSpellPower(int spellPower){
            //dokończ
        }
        //////////////////////////////////////////////
        void setKnowledge(int knowledge){
            //dokończ
        }
        //////////////////////////////////////////////
        void setGold(int gold){
            //dokończ
        }
        //////////////////////////////////////////////
        void setMovementPoints(int movementPoints){
            //dokończ
        }
        //////////////////////////////////////////////
        void setExperience(int experience){
            //dokończ
        }
        //////////////////////////////////////////////
        void setLevel(int level){
            //dokończ
        }
        //////////////////////////////////////////////
        void setSpellPoints(int spellPoints){
            //dokończ
        }
        //////////////////////////////////////////////
        void setMorale(int morale){
            //dokończ
        }
        //////////////////////////////////////////////
        void setLuck(int luck){
            //dokończ
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
        public Player() {
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
        int getGold(){
            //dokończ
        }
        //////////////////////////////////////////////
        void setGold(int gold){
            //dokończ
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