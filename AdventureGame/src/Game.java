import java.util.Scanner;
public class Game {
    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Welcome ");
        System.out.print("Please Enter Name: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Are you ready " + player.getName());
        player.selectHero();
        Location location = null;
        while (true){
            System.out.println("Select Location");
            System.out.println("1- Safe House");
            System.out.println("2- Tool Store");
            int selectLoc = input.nextInt();
            switch (selectLoc){
                case 1:
                    location = new SafeHome(player);
                    break;
                case 2:
                    location =  new ToolStore(player);
                    break;
            }
            if(!location.onLocation()){
                System.out.println("Game Over");
                break;
            }
        }


    }
}
