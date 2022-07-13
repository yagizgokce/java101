public class Inventory {
    private Weapons weapon;
    private Armors armors;
    private String[] awards = new String[0];

    public Inventory() {
        this.weapon = new Weapons("Hand",0,0,0);
        this.armors = new Armors("Naked",0,0,0);
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public Armors getArmors() {
        return armors;
    }

    public void setArmors(Armors armors) {
        this.armors = armors;
    }

    public String[] getAwards() {
        return awards;
    }

    public void setAwards(String[] awards) {
        this.awards = awards;
    }
    public void printAwards(){
        for (String s:this.getAwards()){
            System.out.print(s+" ");
        }
    }

    public boolean isAward(String name){
        for (String s:this.getAwards()){
            if(s.equals(name))
                return true;
        }
        return false;
    }
}
