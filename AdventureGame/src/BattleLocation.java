import java.util.Arrays;
import java.util.Random;

public abstract class  BattleLocation extends Location{
    private String award;
    private Characters obstacle;
    private int maxObstacle;

    public BattleLocation(Player player, String name, String award, Characters obstacle,int maxObstacle) {
        super(player, name);
        this.award = award;
        this.obstacle = obstacle;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        final int  enemyNumber = this.obstacleNumber();
        System.out.println("\n##### "+this.getName()+" ####");
        System.out.println("ATTENTION "+enemyNumber+" "+this.getObstacle().getName()+"\n<---- War or Run ---->");
        String selectedCase = input.nextLine().toUpperCase();
        if(selectedCase.equals("W") || selectedCase.equals("WAR")){
            System.out.println("Good Luck");
            if(war(enemyNumber)){
                System.out.println("You cleaned "+this.getName());
                this.getPlayer().printPlayerInfo();
                String[] arr = Arrays.copyOf(this.getPlayer().getAwards(),this.getPlayer().getAwards().length+1);
                arr[arr.length-1] = this.getAward();
                this.getPlayer().getInventory().setAwards(arr);
                System.out.print("Your awards is: ");
                this.getPlayer().getInventory().printAwards();
                return true;
            }else{
                if (this.getPlayer().getHealth() <= 0){
                    System.out.println("You Dead");
                    return false;
                }else{
                    System.out.println("You leave "+this.getName());
                    this.getPlayer().printPlayerInfo();
                }
            }
        }
        return true;
    }
    public boolean war(int enemyNumber){
        final int obstacleHealth = this.getObstacle().getHealth();
        for(int i = 0; i < enemyNumber; i++){
            this.getObstacle().setHealth(obstacleHealth);
            while(this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0){
                printStatus((enemyNumber-i));
                Random r = new Random();
                int firstMove = r.nextInt(2)+1;
                System.out.println("<---- Hit or Run ----> ");
                String selected = input.nextLine().toUpperCase();
                if(selected.equals("H") || selected.equals("HIT")){
                    switch (firstMove){
                        case 1:
                            playerAttack();
                            obstacleAttack();
                            break;
                        case 2:
                            obstacleAttack();
                            playerAttack();
                            break;
                    }
                }
                else {
                    return false;
                }

            }
            if(this.getObstacle().getHealth() <= 0){
                System.out.println("\nKill one Zombie \nYou earn "+this.getObstacle().getMoney()+" money" );
                this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstacle().getMoney());
            }
            if (this.getPlayer().getHealth() <= 0){
                return false;
            }
        }
        return true;
    }
    public void printStatus(int num){
        System.out.println("\n<-------------- War Status ------ Left Enemies: "+num+" ----->");
        this.getPlayer().printPlayerInfo();
        this.getObstacle().printCharInfo();
        System.out.println("<---------------------------------------------------------->\n");

    }
    public void playerAttack(){
        System.out.println(this.getPlayer().getName()+" attack");
        int damage = this.getPlayer().getDamage();
        this.getObstacle().setHealth(this.getObstacle().getHealth()-damage);
    }
    public void obstacleAttack(){
        if(this.getObstacle().getHealth() > 0){
            System.out.println("Obstacle attack ");
            int damageObstacle = this.getObstacle().getDamage()-this.getPlayer().getArmor().getProtection();
            if(damageObstacle < 0){
                damageObstacle = 0;
            }
            this.getPlayer().setHealth(this.getPlayer().getHealth()-damageObstacle);
        }
    }
    public int obstacleNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle())+1;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public Characters getObstacle() {
        return obstacle;
    }

    public void setObstacle(Characters obstacle) {
        this.obstacle = obstacle;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
