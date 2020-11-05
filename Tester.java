import java.util.Arrays;
class Tester{
  public static void main(String[] args){
    SuperArray x = new SuperArray(20);
    System.out.println(x.isEmpty()); //should return true bc empty
    System.out.println(x.size()); //return 0 bc empty
    x.add("a");
    x.add("b");
    System.out.println(x.size()); //return 2
    System.out.println(x.get(1)); //return b bc index 1
    System.out.println(x.toString()); //return [a,b]
    x.add("c");
    System.out.println(x.toString());//return [a,b,c]
    x.set(2, "x");
    System.out.println(x.toString());//return [a,b,x]
    System.out.println(x.contains("a"));//return true
    System.out.println(x.contains("q"));//return false
    x.add(0, "first");
    System.out.println(x.toString());//return [first, a, b, x]
    x.add (2, "hello");
    System.out.println(x.toString());//return [first, a, hello, b, x]
    x.remove(0);
    System.out.println(x.toString());//return [a, hello, b, x]
    x.remove(1);
    System.out.println(x.toString());//return [a, b, x]
    System.out.println(x.indexOf("p"));//return -1
    System.out.println(x.indexOf("x"));//return 2
    x.add(3, "y");
    System.out.println(Arrays.toString(x.toArray()));//return [a,b,x,y]
  }
}
