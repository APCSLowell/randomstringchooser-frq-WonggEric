import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList <String> list; 
  public RandomStringChooser(String[] wordArray){
    list = new ArrayList<>();
    for(int i = 0; i<wordArray.length;i++){
      list.add(wordArray[i]);
    }
  }
  public String getNext(){
    int rand = (int)(Math.random()*list.size());
    if(list.size()==0){
      return "NONE";
    }else{
      return list.remove(rand);
    }
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
