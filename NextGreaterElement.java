class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=nums2.length-1;i>=0;i--) {
            if(stack.isEmpty()) {
                stack.push(nums2[i]);
                hmap.put(nums2[i],-1);
            }
            else {
                while(!stack.isEmpty() && nums2[i]>=stack.peek()) {
                    stack.pop();
                }
                if(!stack.isEmpty()) {
                    hmap.put(nums2[i],stack.peek());
                }
                else {
                    hmap.put(nums2[i],-1);
                }
                stack.push(nums2[i]);
            }
        }

        for(int i=0;i<nums1.length;i++) {
            nums1[i] = hmap.get(nums1[i]);
        }
        return nums1;
    }
}
