package ArraysExamples;

public class Arrays {

    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int number: numbers) {
            System.out.println("number = " + number);
        }

        int[] nums = new int[4];
        // устанавливаем значения элементов массива
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 100;

        // получаем значение третьего элемента массива
        System.out.println(nums[2]);    // 4
        System.out.println("length - "+nums.length);

        int last = nums[nums.length-1];
        System.out.println("last element - "+last);

        int[][] nums2 = new int[2][3];
        // установим элемент первого столбца второй строки
        nums2[1][0]=44;
        nums2[0][0]=10;
        System.out.println(nums2[1][0]);
        System.out.println(nums2[0][0]);

        //Перебор многомерных массивов в цикле
        int[][] numss = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < numss.length; i++){
            for(int j=0; j < numss[i].length; j++){

                System.out.printf("%d ", numss[i][j]);
            }
            System.out.println();
        }



    }

}