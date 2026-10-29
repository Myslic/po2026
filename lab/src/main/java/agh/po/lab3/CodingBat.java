package agh.po.lab3;

public class CodingBat {
    boolean doubleX(String str) {
        int c = str.indexOf("x");
        if( c + 1 >= str.length())
            return false;
        else
            return str.charAt(c + 1) == 'x';
    }
    public boolean array123(int[] nums) {
        boolean czy = false;
        for(int i = 0; i<= nums.length - 3; i++){
            if(nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3){
                czy = true;
            }

        }
        return czy;


    }

    public static void main(String[] args) {
        CodingBat nowy = new CodingBat();
        int[] y = new int[]{2,2,3};
        System.out.print(nowy.array123(y));
    }
}
