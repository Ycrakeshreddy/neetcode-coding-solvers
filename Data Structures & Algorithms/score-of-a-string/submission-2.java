class Solution {
    public int scoreOfString(String s) {


        int score = 0;

        for(int i=0;i<s.length()-1;i++){

            int a1 = s.charAt(i);
            int a2 = s.charAt(i+1);

            score += Math.abs(a1-a2);


        }

        return score;
        

    }
}