class Solution {
    public int[] getConcatenation(int[] nums) {
      List<Integer> I= new ArrayList<>();
      for(int i=0;i<nums.length;i++){
         I.add(nums[i]);

      }
      for(int i=0;i<nums.length;i++){
          I.add(nums[i]);
      }
         System.out.println(I);
         int [] ans = I.stream().mapToInt(i-> i).toArray();
         return ans;
       } 
    }
