class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        return helper(dictionary , sentence);
    }
    public String helper(List<String> list , String sentence){
         String[] arr = sentence.split(" "); // to create a array seprated by spaces;
         for(String s:list){
            check(s , arr);
         }
         return String.join(" " , arr);
    }
    public void check(String s , String[] arr){
      for(int i = 0 ;i<arr.length;i++){
        if(arr[i].startsWith(s)){
            arr[i]=s;
        }
      }
    }
  
}