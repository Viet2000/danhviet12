

public class UncheckedExceptionSample {
    public static void main(String[] args) {
    int a = 6;
    int b = 3;
    if(b!=0){
        System.out.println(a/b);
    }
    UncheckedExceptionSample ues = new UncheckedExceptionSample();
    ues.test(null);
    }
    public void test(String name){
try{
    System.out.println(name.toUpperCase());
}catch (NullPointerException e){
    System.out.println(e.toString());
  e.printStackTrace();
}
    }
}
