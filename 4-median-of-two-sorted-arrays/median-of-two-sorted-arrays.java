class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] k= new int[m+n];
        for(int i=0;i<m;i++){
            k[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            k[m+i]=nums2[i];
        }
        Arrays.sort(k);
        int O=k.length;
        if(O%2!=0){
            return k[O/2];
            }
            else {
               return( k[O/2-1]+k[O/2])/2.0;
            }
                
            
        
    }
}