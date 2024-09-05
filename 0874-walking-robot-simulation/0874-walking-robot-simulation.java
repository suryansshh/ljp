class Solution {
    static class Pair{
        int x;
        int y;
        Pair(int xx, int yy){
            this.x = xx;
            this.y = yy;
        }
    }
    public int robotSim(int[] commands, int[][] obstacles) {

       

        boolean up = true;
        boolean down = false;
        boolean right = false;
        boolean left = false;
        int answer = 0;
        // HashMap<Pair,Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for(int[] i:obstacles){
            // HashMap.put(new Pair(i[0],i[1]),1);
            // Pair pair = new Pair(i[0],i[1]);
            String s = String.valueOf(i[0])+" "+String.valueOf(i[1]);
            set.add(s);
        }
        int x = 0;
        int y = 0;

        for(int i=0;i<commands.length;i++){

            int val = commands[i];

            if(val<0){

                if(up){

                    if(val==-1){
                        up=false;
                        right = true;
                    }
                    else if(val==-2){
                        up=false;
                        left = true;
                    }
                }
                else if(right){

                    if(val==-1){

                        down = true;
                        right = false;
                    }
                    else if(val==-2){
                        up = true;
                        right = false;
                    }
                }
                else if(left){

                    if(val==-1){
                        up=true;
                        left  = false;
                    }
                    else if(val==-2){
                        down = true;
                        left = false;
                    }
                }
                else if(down){
                     
                     if(val==-1){
                        left = true;
                        down = false;
                     }
                     else if(val==-2){
                        right = true;
                        down = false;
                     }
                }
            }
            else{

                 for(int j=1;j<=val;j++){

                     int prevx = x;
                     int prevy = y;
                     if(up) y++;
                     else if(down) y--;
                     else if(right) x++;
                     else x--;

                    String s = String.valueOf(x)+" "+String.valueOf(y);

                     if(set.contains(s)){

                        x = prevx;
                        y = prevy;
                        break;
                     }
                    //  maxix = Math.max(x,maxix);
                    //  maxiy = Math.max(y,maxiy);
                    answer = Math.max(answer, x*x+y*y);


                 }
            }
        }
        // System.out.println(x +" "+y);


        return answer;

        
    }
}