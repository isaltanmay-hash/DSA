class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        ArrayList<Character> al1=new ArrayList<>();
        ArrayList<Character> al2=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            al1.add(s.charAt(i));
            al2.add(t.charAt(i));
        }
        Collections.sort(al1);
        Collections.sort(al2);
        return al1.equals(al2); 
    }
}