//Take integer inputs until you encounter a negative number. Then stop accepting input and check if the entered numbers are divisible by 6 or not.
//If they are, add them all up and display their sum.

import java.util.*; 

class codes { 

    public static void main(String[] args) { 
       Scanner sc =new Scanner(System.in);
       ArrayList<Integer> al=new ArrayList<>();
       int temp=sc.nextInt();
       int sum=0;
       while(temp>0){
        al.add(temp);
        temp=sc.nextInt();
       }
       for(int i=0;i<al.size();i++){
        if(al.get(i)%6==0){
            sum+=al.get(i);
        }
       }
       System.out.println("The sum is "+ sum);
    }
} 
