class Solution {
    public String maximumOddBinaryNumber(String s) {
        int onescount=0;
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                onescount++;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(onescount>1){
                onescount--;
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        sb.append('1');
        return sb.toString();
    }
}
