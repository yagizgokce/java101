public class Armors {
    private String name;
    private int protection;
    private int price;
    private int id;

    public Armors(String name, int protection, int price, int id) {
        this.name = name;
        this.protection = protection;
        this.price = price;
        this.id = id;
    }
    public static Armors[] armors(){
        Armors pistol = new Armors("SOFT",1,15,1);
        Armors sword = new Armors("MEDIUM",3,25,2);
        Armors rifle = new Armors("HARD",5,40,3);
        Armors[] armorList = {pistol,sword,rifle};
        return armorList;
    }
    public static Armors getWeaponsByID(int id){
        for(Armors a : Armors.armors()){
            if(a.getId() == id){
                return a ;
            }
        }
        return null;
    }
    public static Armors getArmorByName(String name){
        for(Armors w : Armors.armors()){
            if(w.getName().equals(name)){
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

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
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
