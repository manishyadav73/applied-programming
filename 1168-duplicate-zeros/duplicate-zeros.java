class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int res[]=new int[n];
       int source=0;
       int des=0;
       while(source<n){
        if(arr[source]==0){
            if(des<n){
            res[des]=0;}
            des++;
            if(des<n){
            res[des]=0;}
        }else{
            if(des<n){
            res[des]=arr[source];
        }}
        des++;
        source++;
       }
        for(int i=0;i<n;i++){
            arr[i]=res[i];
        }
    }
}