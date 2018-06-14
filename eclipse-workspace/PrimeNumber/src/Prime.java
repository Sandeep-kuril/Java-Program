import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int flag=0;
        System.out.println("Enter any Number:");
        int pri=sc.nextInt();
        int m=pri/2;
        if(pri==0 ||pri==1) {
        	System.out.println(pri+": Its Not a Prime Number");
        }
        	for(int j=2;j<=m;j++)
        	{
        		if((pri%j)==0)
        		
        			    System.out.println(pri+": Its Not a Prime Number");
        		flag=1;
        		break;
        	}
        	if(flag==0) {
        		System.out.println(pri+": It is a Prime Number");
        	}
        
	}

}
