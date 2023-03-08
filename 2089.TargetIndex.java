class TargetIndex {
    public List<Integer> targetIndices(int[] nums, int target) {

        // sort
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(nums[j-1]>nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1]= temp;

                }
                
            }
        }
        

        List<Integer> elements= new ArrayList<>();

        for(int i=0;i<n;i++){
            if(target == nums[i]){
               elements.add(i);
            }
        }
      return elements;  
    }
}
