public class SafeHome extends Location{
    public SafeHome(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("\n####Safe House####");
        System.out.println("Your health is "+ getPlayer().getHealth());
        healPlayer();
        return true;
    }
    public void healPlayer(){
        int health = Characters.getHeroByName(this.getPlayer().getHeroName()).getHealth();
        if(this.getPlayer().getHealth() != health){
            this.getPlayer().setHealth(health);
            System.out.println("You are healing now....");
            System.out.println("<---- Health: "+ getPlayer().getHealth()+" ---->");
        }else{
            System.out.println("You are so goooood");
        }
    }

}
