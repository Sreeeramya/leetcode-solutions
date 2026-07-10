class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String a1[]=sentence1.split(" ");
        String a2[]=sentence2.split(" ");
        if(a1.length>a2.length){
            String temp[]=a1;
            a1=a2;
            a2=temp;
        }
        int i=0;
        int j1=a1.length-1;
        int j2=a2.length-1;
        while(i<a1.length && a1[i].equals(a2[i])){
            i++;
        }
        while(j1>=i && a1[j1].equals(a2[j2])){
            j1--;
            j2--;
        }
        return i>j1;
    }
}