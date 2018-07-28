package test;

//Java program to find the number of charters
//in the longest word in the sentence.
class JavaLongestStringInStringArray {
  
 static int LongestWordLength(String str)
 {
     String[] words = str.split(" ");
     int length = 0;
      
     for(String word:words){
         if(length < word.length()){
             length = word.length();
         } 
     }
     return length;
 }
 
 static String LongestWord(String str)
 { 
	 String longestString=null;
     String[] words = str.split(" ");
     int maxLength = 0;
      
     for(String word:words){
         if(word.length()>maxLength){
             maxLength = word.length();
             longestString= word;
         } 
     }
     return longestString;
 }

  
 // Driver code
 public static void main(String args[])
 {
     String str = "The cow jumped over the moon";
      
     System.out.println(LongestWordLength(str));
     
     System.out.println(LongestWord(str));
 }
}
