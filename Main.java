public class Main {
  public static void main(String[] args) {
    int n=23, mid=0, result=0;
    mid=(n+1)/2;
    if(n%2==0){
     result=(n*mid)+mid;
    }else{
     result=n*mid;
    }
    System.out.println(result);
   
  }
}

