class Solution {
    public int lengthOfLastWord(String s) {

        s = s.trim();

       int lastindex = s.lastIndexOf(" ");

       String lastword = s.substring(lastindex+1);

       return lastword.length();
       


        
    }
}