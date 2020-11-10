class SuperArray{
  private String [] data;
  private int size;
  public SuperArray(){
  data = new String[10];
  }
  public SuperArray(int initialCapacity){
    if(initialCapacity < 0){
      throw new IllegalArgumentException("Initial capacity cannot be less than 0");
    }
    data = new String[initialCapacity];
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean add(String element){
    if(data.length == size){
      resize();
    }
    data[size] = element;
    size += 1;
    return true;
  }
  public String get(int index){
    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
    return data[index];
  }
  public String set(int index, String element){
    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
    String x = data[index];
    data[index] = element;
    return x;
  }
  private void resize() {
    String[] y = new String[data.length * 2 + 1];
    for(int i = 0; i < size; i++){
      y[i] = data[i];
    }
    data = y;
  }
  public boolean isEmpty(){
    if (size == 0){
      return true;
    }
    else{
      return false;
    }
  }
  public void clear(){
    data = new String[size];
    size = 0;
  }
  public String toString(){
    if (size == 0){
      return "[]";
    }
    String newResult = "[";
    for(int i = 0; i < size - 1; i++){
      newResult = newResult + data[i] + ", ";
    }
    return newResult + data[size - 1] + "]";
  }
  public boolean contains(String s){
    for(int i = 0; i < size; i++){
      if((data[i] == s) || (data[i].equals(s))) {
        return true;
      }
    }
    return false;
  }
  public void add(int index, String element){
    if(index < 0 || index > size()){
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
    if (size == data.length){
      resize();
    }
    for(int i = size; index < i ; i--){
      data[i] = data[i - 1];
    }
    data[index] = element;
    size += 1;
  }
  public String remove (int index){
    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
    String removedNew = data[index];
    for(int i = index; i < size -  1; i++){
      data[i] = data[i + 1];
    }
    size -= 1;
    data[size] = null;
    return (removedNew);
  }
  public int indexOf(String s){
    for(int i = 0; i < size; i++){
      if (data[i].equals(s)){
        return i;
      }
    }
    return -1;
  }
  public String[] toArray(){
    String[] finalResultString = new String[size];
    for(int i = 0; i < size; i++){
      finalResultString[i] = data[i];
    }
    return finalResultString;
  }

}
