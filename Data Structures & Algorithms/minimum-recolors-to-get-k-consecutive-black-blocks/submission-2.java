class Solution {
    public int minimumRecolors(String blocks, int k) {

        blocks = blocks.toUpperCase();
        int count = 0;
        int min  = k;

        for(int i=0;i<k;i++) {

            if(blocks.charAt(i) == 'B'){

                count++;
            }

        }

     min =  k-count;

     for(int i=k;i<blocks.length();i++) {
        if(blocks.charAt(i-k)=='B'){
            count--;
        }


        if(blocks.charAt(i)=='B'){
            count++;
        }

        min = Math.min(min,k-count);

     }

     return min;




        
    }
}