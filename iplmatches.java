import java.util.*;
class iplmatches{
    public static void main(String[]arg){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of teams: ");
        int n=s.nextInt();
        String[]team=new String[n];
        s.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter team ");
            team[i]=s.nextLine();

        }
        ArrayList<String[]> match=new ArrayList<>();
        System.out.println("Enter number of match for each team: ");
        int m=s.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                for(int k=0;k<m;k++){
                    match.add(new String[]{team[i],team[j]});
                    
                }
            }
        }
        Collections.shuffle(match);
        int index=1;
        for(String[] i:match){
            System.out.println("Match "+index+" : "+i[0]+" vs "+i[1]);
            index++;
        }
        
    }
}
