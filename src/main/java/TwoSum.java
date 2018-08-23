/**
 * Created by liruiqi on 2018/8/23.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] indices = new int[2];

        for(int i = 0;i< nums.length;i++){

            for(int j = i ; j<nums.length; j++){

                 int sum  = nums[i] + nums[j];

                if(sum==target){
                    indices[0] = i;
                    indices[1] = j;
                }

            }

        }
        return  indices;

    }
}
