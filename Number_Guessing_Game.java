import java.util.*;
class Number_Guessing_Game{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Enter player 1 name:");
        String name1=s.nextLine();
        System.out.println("Enter player 2 name:");
        String name2=s.nextLine();
        List<Integer> nums = new ArrayList<>();
        while(nums.size()!=5){
            int d=r.nextInt(10);
            if(!nums.contains(d))
            nums.add(d);
        }
        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();
        int s1=0;
        int s2=0;
        for(int i=1;i<=3;i++){
            System.out.print("Player1 choice "+i+" :");
            int ch=s.nextInt();
            while(player1.contains(ch) || player2.contains(ch)){
                System.out.println("The number already taken...choose another number");
                ch=s.nextInt();
            }
            player1.add(ch);
            if(nums.contains(ch)){
                System.out.println("CORRECT");
                s1++;
            }
            else{
                System.out.println("WRONG");
            }

            System.out.print("Player2 choice "+i+" :");
            int ch1=s.nextInt();
            while(player1.contains(ch1) || player2.contains(ch1)){
                System.out.println("The number already taken...choose another number");
                ch1=s.nextInt();
            }
            player2.add(ch1);
               
            if(nums.contains(ch1)){
                System.out.println("CORRECT");
                s2++;
            }
            else{
                System.out.println("WRONG");
            }

            
        }
        System.out.println("--------------------------");
        System.out.println("The numbers that in computer's mind are "+nums);
        System.out.println("PLAYER1 Choosed numbers are "+player1);
        System.out.println("PLAYER1 Total score is "+s1);
        System.out.println("PLAYER2 Choosed numbers are "+player2);
        System.out.println(" Total score is "+s2);
        if(s1>s2){
            System.out.println("--------------------"+name1+" IS THE WINNER------------------");
        }
        else if(s1<s2){
            System.out.println("--------------------"+name2+" IS THE WINNER------------------");
        }
        else{
            System.out.println("--------------------THE MATCH IS DRAW--------------------");
        }

    }
}