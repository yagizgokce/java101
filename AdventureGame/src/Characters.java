public class Characters {
    private int damage;
    private int health;
    private int money;
    private String name;
    private int ID;

    public Characters(int damage, int health, int money, String name,int ID) {
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.name = name;
        this.ID = ID;
    }
    public static Characters[] heros(){
        Characters samurai = new Characters(5,21,15,"Samurai",1);
        Characters archer = new Characters(7,18,20,"Archer",2);
        Characters knight = new Characters(8,24,5,"Knight",3);
        Characters[] heroList = {samurai,archer,knight};
        return heroList;
    }
    public static Characters[] obstacles(){
        Characters zombie = new Characters(3,10,4,"Zombie",1);
        Characters vampire = new Characters(4,14,7,"Vampire",2);
        Characters bear = new Characters(7,20,12,"Bear",3);
        Characters[] obstacleList = {zombie,vampire,bear};
        return obstacleList;
    }
    public static Characters getHeroByName(String name){
        for(Characters w : Characters.heros()){
            if(w.getName().equals(name)){
                return w ;
            }
        }
        return null;
    }

    public static Characters getObstaclesByName(String name){
        for(Characters w : Characters.obstacles()){
            if(w.getName().equals(name)){
                return w ;
            }
        }
        return null;
    }
    public void  printCharInfo(){
        System.out.println("----"+ this.getName() +" ----\n"+"ID: "+this.getID()  + "\t Damage: "+ this.getDamage() +"\t Health:"+ this.getHealth()+
                "\t Money:"+this.getMoney());
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
