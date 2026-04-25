class Solution {
    public boolean detectCapitalUse(String word) {
        int e=word.length();
        if(word.equals(word.toLowerCase())){
            return true;
        }
        if(word.equals(word.toUpperCase())){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0)) && word.substring(1,e).equals(word.substring(1,e).toLowerCase())){       return true;
        }
        return false;
    }
}