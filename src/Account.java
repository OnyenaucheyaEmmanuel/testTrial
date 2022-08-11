public class Account {
 private static int accNum;
 private static String name;


  public static void setName(String name){
   Account.name = name;
  }

  public static String getName(){
   return name;
  }
 public static void setAccNum(int accNum) {
  Account.accNum = accNum;
 }
 public static int getAccNum(){
   return accNum;
 }

}
