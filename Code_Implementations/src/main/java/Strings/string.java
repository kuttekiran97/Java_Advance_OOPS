package Strings;

public class string {


  public static void main(String[] args) {
      String s1 = "Kiran";
      String s2 = "Mahesh";

      //System.out.println(s1==s2);
      StringBuffer sb = new StringBuffer("Kiran");
      StringBuffer sb1  = new StringBuffer("Kiran");

      //To Compare the content in String
      System.out.println(s1.equals(s2));

      //To Compare the content in Stringbufer
      System.out.println(sb.toString().equals(sb1.toString()));



  }


}
