public class JaggedArray {
    public static void main(String[] args) {
        int nums[][] = new int[3][]; //jagged
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];
        for (int i =0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                nums[i][j] = (int)(Math.random() * 100);
            }
        }

        for (int i =0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
