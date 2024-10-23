import java.util.*;

class Solution {

    private static boolean isValid(int x, int y){
            if (x<0 || x>10 || y<0 || y>10 ){
                return false;
            }
            else{
                return true;
            }
        }
        
        
    private static final HashMap<Character, int[]> map = new HashMap<>();
        
    private static void init(){
            map.put('U', new int[]{0,1});
            map.put('D', new int[]{0,-1});
            map.put('L', new int[]{-1,0});
            map.put('R', new int[]{1,0});
        }
    
    public int solution(String dirs) {
        HashSet<String> set = new HashSet<>();
        init();
        int x =5;
        int y =5;
        for (int i=0; i<dirs.length(); i++){
            int[] offset = map.get(dirs.charAt(i));
            int nx = x + offset[0];
            int ny = y + offset[1];
            if (!isValid(nx, ny)) {
                continue;
            }
            
            set.add(x+" "+y+" "+nx+" "+ny);
            set.add(nx+" "+ny+" "+x+" "+y);
            
            x = nx;
            y = ny; 
        }
        
        return set.size()/2;
    }
}