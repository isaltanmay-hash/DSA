//fun(n)=padho func(n-1) ko
class Solution {
    public String countAndSay(int n) {
        if(n==1)return "1";
        String s=countAndSay(n-1);
        //s ko padho
        String ans="";
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }else{
                ans+=j-i;
                ans+=s.charAt(i);
                i=j;
            }
        }
        ans+=j-i;
        ans+=s.charAt(i);
        return ans;
    }
}