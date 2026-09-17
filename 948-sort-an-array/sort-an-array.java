class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }
    public static void mergeSort(int[] arr) {
        int n= arr.length;
        //base case
        if(n==1)return; //array ki length agar 1 he to return kar do. (1 element is always sorted).
        //step 1 make 2 khali arrays of size n/2 each.
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        //step 2 copy-paste original array elements to them.
        int idx=0;  //idx traverse karenga arr par.
        for (int i = 0; i < a.length; i++) {
            a[i]=arr[idx];
            idx++;
        }
        for (int i = 0; i < b.length; i++) {
            b[i]=arr[idx];
            idx++;
        }
        //step 3 apply magic of recursion on a and b i.e sort a and b by dividing it
        mergeSort(a);
        mergeSort(b);

        //step 4 merge a and b in arr
        merge(a,b,arr);

    }
    public static void merge(int[] a, int[] b, int[] c) {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                //k++;
            }
            else{
                c[k]=b[j];
                j++;
                //k++;
            }
            k++;
        }
        if(i==a.length){//a array khatam he -> b ke bache hue elements lo.
            while(j<b.length){
                c[k]=b[j];
                k++;
                j++;
            }
        }
        else{
            while(i<a.length){
                c[k]=a[i];
                k++;
                i++;
            }
        }
    }
}