class Solution {
    public int trap(int[] height) {
         int res = 0;
        int left = 0, right = height.length - 1;
        if (left >= right) return 0;
        int leftheight = height[left];
        int rightheight = height[right];
        
        
        while (left < right) {
            if(leftheight < rightheight) {
                left ++;
                if (leftheight >  height[left]) {
                    res += leftheight - height[left];
                } else {
                    leftheight = height[left];
                }
            } else {
                right --;
                if (height[right] < rightheight) {
                    res += rightheight - height[right];
                } else {
                    rightheight = height[right];
                }
            }
        }
        

        
        return res;

    }
}