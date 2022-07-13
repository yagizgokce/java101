public class Inventory {
    private Weapons weapon;
    private Armors armors;

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
}
