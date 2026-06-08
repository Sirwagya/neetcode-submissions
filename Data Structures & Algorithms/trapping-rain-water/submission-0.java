public class Solution {
    public int trap(int[] h) {
        int l = 0;
        int r = h.length - 1;
        int lmax = 0;
        int rmax = 0 ;
        int ans = 0;
        while (l < r) {
            lmax = Math.max(lmax, h[l]);
            rmax = Math.max(rmax, h[r]);
            if (lmax < rmax) {
                ans += lmax - h[l];
                l++;
            }
            else {
                ans += rmax - h[r];
                r--;
            }
        }
        return ans;
    }
}