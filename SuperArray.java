class SuperArray{
  private String [] data;
  private int size;
  public SuperArray(int initialCapacity){
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
    return data[index];
  }
  public String set(int index, String element){
    String x = data[index];
    data[index] = element;
    return x;
  }
  private void resize() {
    String[] y = new String[data.length + 1];
    for(int i = 0; i < data.length; i++){
      y[i] = data[i];
      data = y;
    }
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
    String newResult = "[";
    for(int i = 0; i < size - 1; i++){
      newResult = newResult + data[i] + ", ";
    }
    return newResult + data[size - 1] + "]";
  }
  public boolean contains(String s){
    for(int i = 0; i < size; i++){
      if((data[i] == s) || (data[i].equals(s) && s != null)) {
        return true;
      }
    }
    return false;
  }

}
