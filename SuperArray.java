class SuperArray{
  private String [] data;
  private int size;
  public SuperArray(){
    data = new String[10];
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
  private void resize(){
    String[] y = new String[data.length + 1];
    for(int i = 0; i < data.length; i++){
      y[i] = data[i];
      data = y;
    }
  }
}
