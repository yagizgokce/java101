import java.util.List;

public class ToolStore extends Location{
    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("\n#####Tool Store#####");
        System.out.println("\n1-Weapon \n2-Armor\n3-exit");
        int temp = input.nextInt();
        if(temp == 1 || temp == 2){
            showTools(temp);
        }
        return true;
    }
    public void showTools(int toolID){
        switch (toolID){
            case 1:
                for (Weapons w:Weapons.weapons()){
                    System.out.println(w.getId()+"\t Weapon: "+w.getName()+"\t Damage: "+w.getDamage()+"\t Price: "+w.getPrice());
                }
                System.out.print("If you want to buy anything enter ID number: ");
                int selectWeapon = input.nextInt();
                if(selectWeapon < 1 || selectWeapon > Weapons.weapons().length){
                    System.out.print("Please Enter Valid ID or You can enter '-1' to go back store ");
                    selectWeapon = input.nextInt();
                    if (selectWeapon == -1){
                        onLocation();
                    }
                }
                else{
                    buyWeapon(selectWeapon);
                }
                break;
            case 2:
                for (Armors a:Armors.armors()){
                    System.out.println(a.getId()+"\t Armor: "+a.getName()+"\t Protection: "+a.getProtection()+"\t Price: "+a.getPrice());

                }
                System.out.print("If you want to buy anything enter ID number: ");
                int selectArmor = input.nextInt();
                if(selectArmor < 1 || selectArmor > Armors.armors().length){
                    System.out.print("Please Enter Valid ID or You can enter '-1' to go back store ");
                    selectArmor = input.nextInt();
                    if (selectArmor == -1){
                        onLocation();
                    }
                }
                else{
                    buyArmor(selectArmor);
                }
                break;
            default:
                onLocation();
        }
    }
    public void buyWeapon(int id){
        Weapons weapon = Weapons.getWeaponsByID(id);
        if(this.getPlayer().getMoney() >= weapon.getPrice()){
            System.out.println("You bought "+ weapon.getName());
            int newMoney = this.getPlayer().getMoney() - weapon.getPrice();
            this.getPlayer().setMoney(newMoney);
            System.out.println("Your remaining money is " + this.getPlayer().getMoney());
            this.getPlayer().getInventory().setWeapon(weapon);
        }else {
            System.out.println("You have not enough money");
        }
        onLocation();

    }
    public void buyArmor(int id){
        Armors armor = Armors.getWeaponsByID(id);
        if(this.getPlayer().getMoney() >= armor.getPrice()){
            System.out.println("You bought "+ armor.getName()+" armor");
            int newMoney = this.getPlayer().getMoney() - armor.getPrice();
            this.getPlayer().setMoney(newMoney);
            System.out.println("Your remaining money is " + this.getPlayer().getMoney());
            this.getPlayer().getInventory().setArmors(armor);
        }else {
            System.out.println("You have not enough money");
        }
        onLocation();
    }

}
