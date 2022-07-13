import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String name;
    private String heroName;
    private Inventory inventory;
    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }


    public void selectHero(){
        Characters[] heroList = Characters.heros();
        for (Characters temp : heroList){
            temp.printCharInfo();
        }
        System.out.print("\nSelect Your Hero: ");
        int heroID = input.nextInt();
        switch (heroID){
            case 1:
                initHero(heroList[0]);
                System.out.println( "Good choice your hero is " + this.heroName);
                break;
            case 2:
                initHero(heroList[1]);
                System.out.println( "Good choice your hero is " + this.heroName);
                break;
            case 3:
                initHero(heroList[2]);
                System.out.println( "Good choice your hero is " + this.heroName);
                break;
            default:
                System.out.println("Let's choose your Hero");
                selectHero();
        }
    }
    public void initHero(Characters hero){
        this.setDamage(hero.getDamage());
        this.setHealth(hero.getHealth());
        this.setMoney(hero.getMoney());
        this.setHeroName(hero.getName());
    }
    public void printPlayerInfo(){
        System.out.println("---- " + this.getName() + " Info ----\n"+
                "Hero: " + this.getHeroName() + "\t Damage: "+ this.getDamage() +"\t Health:"+ this.getHealth()+
                "\t Money: "+this.getMoney()+"\t Weapon: "+this.getWeapon().getName()+"\t Armor: "+this.getArmor().getName());
    }

    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    public  Weapons getWeapon(){
        return this.getInventory().getWeapon();
    }
    public Armors getArmor(){
       return this.getInventory().getArmors();
    }
    public String[] getAwards(){
        return this.getInventory().getAwards();
    }
}
