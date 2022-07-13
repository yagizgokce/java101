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
        Armors pistol = new Armors("Soft",1,15,1);
        Armors sword = new Armors("Medium",3,25,2);
        Armors rifle = new Armors("Hard",5,40,3);
        Armors[] armorList = {pistol,sword,rifle};
        return armorList;
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
