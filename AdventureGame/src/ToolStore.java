import java.util.List;

public class ToolStore extends Location{
    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are at Tool Store");
        System.out.print("You can buy Weapon-> 1 or Armor-> 2 or exit->3 :");
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
                    buyTool(selectWeapon-1,toolID);
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
                    buyTool(selectArmor-1,toolID);
                }
                break;
            default:
                onLocation();
        }
    }
    public void buyTool(int id, int tool){
        switch(tool){
            case 1:
                Weapons[] list = Weapons.weapons();
                if(getPlayer().getMoney() >= list[id].getPrice()){
                    System.out.println("You bought "+ list[id].getName());
                    int newMoney = getPlayer().getMoney() - list[id].getPrice();
                    getPlayer().setMoney(newMoney);
                    System.out.println("Your remaining money is " + getPlayer().getMoney());
                }else {
                    System.out.println("You have not enough money");
                }
                onLocation();
                break;
            case 2:
                Armors[] list2 = Armors.armors();
                if(getPlayer().getMoney() >= list2[id].getPrice()){
                    System.out.println("You bought "+ list2[id].getName()+" armor");
                    int newMoney = getPlayer().getMoney() - list2[id].getPrice();
                    getPlayer().setMoney(newMoney);
                    System.out.println("Your remaining money is " + getPlayer().getMoney());
                }else {
                    System.out.println("You have not enough money");
                }
                onLocation();
                break;

        }

    }
}
