class MethodOver {
    void sum(int a, int b) 
   { 
     int s = a + b; 
     System.out.println("Sum of 2 arguements : " +s); 
   } 

   void sum(int a, int b, int c) 
   { 
     int t = a + b + c; 
     System.out.println("Sum of 3 arguements: " +t); 
   } 
public static void main(String[] args) 
{ 
   MethodOver a = new MethodOver(); 
    a.sum(10, 20);
    a.sum(50, 100, 200);
  } 
}
