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
    public boolean noTriples(int[] nums) {
            boolean triplet = true;
            boolean k = false;
            for(int j = 0; j<= nums.length - 3; j++){
                    if(nums[j] == nums[j+1] && nums[j+1] == nums[j+2])
                        k = true;
                    if(k)
                        triplet = false;
            }
            return triplet;
    }
    public int sum13(int[] nums) {
        int sum = 0;
        boolean prev = false;
        for(int i = 0; i<nums.length; i++){
            if(!prev) {
                if (nums[i] != 13) {
                    sum = sum + nums[i];
                }
                else {
                    prev = true;
                }
            }
            else
                prev = false;

        }
        return sum;
    }

    public static void main(String[] args) {
        CodingBat nowy = new CodingBat();
        int[] y = new int[]{0};
        System.out.print(nowy.sum13(y));
    }
}
