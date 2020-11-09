public class Demo{
  public String [] data;
  public int size;
  public static void removeDuplicates(SuperArray s){
    for(int i = 0; i < s.size(); i++){//traverses superarray
      if(i != s.indexOf(s.get(i))){
        s.remove(i);
        i--;
      }
    }
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray overlapArray = new SuperArray();
    int index = 0;
    for(int i = 0; i < a.size(); i++){
      for(int j = 0; j < b.size(); j++){
        if (a.get(i) == b.get(i)){
          //System.out.println(exists);
          overlapArray.add(index, a.get(i));
          index += 1;
        }
      }
    }
  }

  //traverse a: get first element and compare it to each element in b. if element in a = element in b, add it to superarray


  public int lastIndexOf(String value){
    for(int i = size - 1; i >= 0; i++){
      if (data[i].equals(value)){
        return i;
      }
    }
    return -1;
  }

  public boolean equals(SuperArray other){
    if (other.size() != size){
      return false;
    }
    for(int i = 0; i < size; i++){
      if(!(other.get(i).equals(data[i]))){
        return false;
      }
    }
    return true;
  }


  public static void main(String[]args){
    SuperArray words = new SuperArray();
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);  }
}
