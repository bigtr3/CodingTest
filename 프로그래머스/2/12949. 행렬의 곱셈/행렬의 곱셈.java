class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int a = arr1.length;
        int b = arr2[0].length;
        int sum = 0;
        int[][] answer = new int[a][b];
        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr2[0].length; j++){
                sum =0;
                for (int k=0; k<arr2.length; k++){
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum; 
            }
              
        }
        return answer;
    }
}