public class Heros {
    private int damage;
    private int health;
    private int money;
    private String heroName;
    private int ID;

    public Heros(int damage, int health, int money, String heroName,int ID) {
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.heroName = heroName;
        this.ID = ID;
    }
    public static Heros[] heros(){
        Heros samurai = new Heros(5,21,15,"Samurai",1);
        Heros archer = new Heros(7,18,20,"Archer",2);
        Heros knight = new Heros(8,24,5,"Knight",3);
        Heros[] heroList = {samurai,archer,knight};
        return heroList;
    }

    public int getDamage() {
        return damage;
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

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
