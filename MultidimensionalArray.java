public class MultidimensionalArray {
    public static void main(String[] args) {
        int nums[][] = new int[3][3];

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[0].length; j++){
                nums[i][j] = (int)(Math.random() * 100);
            }
        }

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[0].length; j++){
                System.out.print(nums[i][j] + " "); 
            }
            System.out.println();
        }
    }
}
