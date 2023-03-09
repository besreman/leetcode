class Solution {
    public String sortSentence(String s) {
        String[] ar = s.split(" ");
        int index=ar.length;

        for (int j=0;j<index;j++){
            for(int i=1;i<index -j ;i++){
                if(ar[i-1].charAt(ar[i-1].length()-1) > ar[i].charAt(ar[i].length()-1)){
                    String tmp = ar[i];
                    ar[i]=ar[i-1];
                    ar[i-1]=tmp;
                }
            }
        }
        String S="";
        for(int i=0;i<index;i++){
            ar[i] = ar[i].substring(0, ar[i].length()-1);
            S = S.concat(ar[i]);
            if(i != index-1){
                S = S.concat(" ");
            }
        }


        return S;
    }
}
