class Solution {
    public int maxDifference(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);

        }

        int maxodd  = 0;
        int mineven = s.length()-1;


        for(int freq : map.values()) {

            if(freq%2==0) {

                mineven = Math.min(freq,mineven);

            }

            else {

                maxodd = Math.max(freq,maxodd);

            }


        }

        return maxodd - mineven;


    }
}