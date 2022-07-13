public class Weapons {
    private String name;
    private int damage;
    private int price;
    private int id;

    public Weapons(String name, int damage, int price, int id) {
        this.name = name;
        this.damage = damage;
        this.price = price;
        this.id = id;
    }

    public static Weapons[] weapons(){
        Weapons pistol = new Weapons("Pistol",2,25,1);
        Weapons sword = new Weapons("Sword",3,35,2);
        Weapons rifle = new Weapons("Rifle",7,45,3);
        Weapons[] weaponList = {pistol,sword,rifle};
        return weaponList;
    }
    public static Weapons getWeaponsByID(int id){
        for(Weapons w : Weapons.weapons()){
            if(w.getId() == id){
                return w ;
            }
        }
        return null;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
