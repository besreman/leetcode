class Solution {
    public List<String> fizzBuzz(int n) {

        
        List<String> list = new ArrayList<>();

        for(int i=1; i<=n;i++){
            boolean three = (i%3 == 0);
        boolean five = (i%5 == 0);

        if(three && five){
           list.add("FizzBuzz");
        }else if(three)
           list.add("Fizz");
        else if(five){
           list.add("Buzz");
        }else{
            list.add("");
        }

}
   return list;      
    }
}
