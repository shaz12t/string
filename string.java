import java.util.*;
public class string {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    // Concateonation
    String name = "sha";
    String surname = "ily";
String fname= name + surname;
System.out.println(fname.length());
    

// charAt
for(int i =0;i<fname.length(); i++){
    System.out.println(fname.charAt(i));
}
String a="john";
String b = "johnsi";
// == then 0
// a>b +ve
//  a<b -ve
if(a.compareTo(b)== 0){
    System.out.println("match");
}
else{
    System.out.println("unmatched");
}
}
}