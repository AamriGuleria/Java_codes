public class FourSum{
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int a=j+1;
                int b=nums.length-1;
                while(a<b){
                    long sum = (long) nums[i] + nums[j] + nums[a] + nums[b];
                    if(sum<target){
                        a++;
                    }
                    else if(sum>target){
                        b--;
                    }
                    else{
                    List<Integer> quad = Arrays.asList(nums[i], nums[j],nums[a], nums[b]);
                    if (!list.contains(quad)) {
                    list.add(quad);
                    }
                    while (a < b && nums[a] == nums[a + 1]) a++;
                    while (a < b && nums[b] == nums[b - 1]) b--;
                    a++;
                    b--;
                    }
                }
            }
        }
        return list;
    }  
}