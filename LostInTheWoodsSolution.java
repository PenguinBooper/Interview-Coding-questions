import java.util.*;
public class LostInTheWoodsSolution {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        int steps=in.nextInt();
        in.nextLine();
        String ans="";
        String st=in.nextLine();
        for(int i=0;i<(steps*2-1);i++){
            if(' '==st.charAt(i)){
                continue;
            }
            if('S'==st.charAt(i) && '*'==st.charAt(i+2)){         //If there is any * in AFTER S, Jump over it
             ans=ans+"J";
            }
             if('S'==st.charAt(i) && '_'==st.charAt(i+2)){        //If there is any _ AFTER S, Walk over it
                ans=ans+"W";
            }
            if('_'==st.charAt(i) && 'D'==st.charAt(i+2)){         //If there is any D AFTER _, Walk over it
             ans=ans+"W";
            }
            if('_'==st.charAt(i) && '_'==st.charAt(i+2)){         //If there is any _ AFTER _, Walk over it
                ans=ans+"W";
            }
            if('*'==st.charAt(i) && '_'==st.charAt(i-2)){         //If there is any _ BEFORE *, Jump over it
                ans=ans+"J";
            }
        }
        System.out.println(ans);
     } 
 } 
 

