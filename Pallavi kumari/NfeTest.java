///NumberFormatException:-
///At the time of converting String value into the integer value we are getting NumberFormatException. 
///Example:-
class NfeTest 
{ 
public static void main(String[] args) 
{ 
try 
{ 
String str="123"; 
int a=Integer.parseInt(str); 
System.out.println(a);//conversion(string - int) is good
String str1="abc123"; 
int b=Integer.parseInt(str1); 
System.out.println(b);//NumberFormatException 
} 
catch (NumberFormatException ae) 
{ 
System.out.println("geting NumberFormatException"); 
} 
} 
} 