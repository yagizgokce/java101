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
            System.out.println("\n######Locations######");
            System.out.println("Select Location \n1- Safe House \n2- Tool Store \n0- Exit Game");
            int selectLoc = input.nextInt();
            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHome(player);
                    break;
                case 2:
                    location =  new ToolStore(player);
                    break;
            }
            if (location == null){
                System.out.println("\nYou Gave Up ");
                break;
            }
            if(!location.onLocation()){
                System.out.println("Game Over");
                break;
            }
        }


    }
}
