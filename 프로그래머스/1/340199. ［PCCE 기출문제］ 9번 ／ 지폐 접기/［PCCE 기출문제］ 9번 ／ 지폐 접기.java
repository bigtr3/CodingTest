class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int billMin = 0;
        int billMax = 0;
        int walletMin=0;
        int walletMax = 0;
        if (wallet[0]>wallet[1]){
            walletMin = wallet[1];
            walletMax = wallet[0];
        } else {
            walletMin = wallet[0];
            walletMax = wallet[1];
        }
        
        if (bill[0]>bill[1]){
            billMin = bill[1];
            billMax = bill[0];
        } else {
            billMin = bill[0];
            billMax = bill[1];
        }
        
        while ((billMin > walletMin) || (billMax > walletMax)) {
            billMax = billMax/2;
            if (billMax < billMin){
                int a = billMax;
                billMax = billMin;
                billMin = a;
            }
            answer++;
        }
            
        return answer;
    }
    
    
}