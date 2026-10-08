public class Choinka{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        for(int i = 1; i <=n ; i++){
            for(int x = 1; x <= i; x++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}