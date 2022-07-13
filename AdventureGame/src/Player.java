import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String name;
    private String heroName;
    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void selectHero(){
        Heros[] heroList = Heros.heros();
        for (Heros temp : heroList){
            System.out.println(temp.getID() + " Hero: " + temp.getHeroName() + "\t Damage: "+ temp.getDamage() +"\t Health:"+ temp.getHealth()+
            "\t Money:"+temp.getMoney());

        }
        System.out.print("Select Your Hero: ");
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
    public void initHero(Heros hero){
        this.setDamage(hero.getDamage());
        this.setHealth(hero.getHealth());
        this.setMoney(hero.getMoney());
        this.setHeroName(hero.getHeroName());
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


}