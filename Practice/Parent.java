class Demo{
  Demo(int i){
    System.out.println("In Int Con");
  }
  Demo(){
    System.out.println("In Normal Con");
  }
  Demo(String s){
    System.out.println("In Str Con");
  }

  public static void main(String[] args) {
    Demo d = new Demo();
    System.out.println(d);
  }
}