public class SafeHome extends Location{
    public SafeHome(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("\n####Safe House####");
        System.out.println("Your health is "+ getPlayer().getHealth());
        System.out.println("You are healing now....");
        healPlayer();
        System.out.println("<---- Health: "+ getPlayer().getHealth()+" ---->");
        return true;
    }
    public void healPlayer(){
        int health = Characters.getHeroByName(this.getPlayer().getHeroName()).getHealth();
        this.getPlayer().setHealth(health);
    }

}
