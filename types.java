import java.util.*;

public class types
{

    public static void main(String[] args)
    {

    	boolean stop=false;

	do 

	{

		String[] types = {"fire", "water", "electric", "normal", "flying", "rock", "ground", "steel", "dark", "psychic", "grass", "bug", "poison", "dragon", "ghost", "ice", "fighting"};
		boolean foundPrimary = false;
		boolean foundSecondary = false;
		boolean dualType = false;
		String primary = "";
		String secondary = "";

		System.out.println("What type? ");
		
		Scanner in = new Scanner(System.in);
		String type = in.nextLine();	

		StringTokenizer st = new StringTokenizer(type);

		primary = st.nextToken();

		if (st.hasMoreTokens())
		{
		    secondary = st.nextToken();
		    dualType = true;
		}

		if (st.hasMoreTokens())
		    System.out.println("More than two words have been entered. Ignoring other words.");

		if (type.equals("stop"))
		{
		      stop = true;	      
		}
		else
		{
		      for (int i=0; i<types.length; i++)
			    {
				  if (types[i].equals(primary))
				      {System.out.println("Primary type found");
				      foundPrimary = true;}
			    }

			    if (foundPrimary==false)
				      System.out.println("Primary type not found. Make sure no capitals are used.");

		      if (dualType==true)
		      {
		      for (int i=0; i<types.length; i++)
			    {
				  if (types[i].equals(secondary))
				      {System.out.println("Secondary type found");
				      foundSecondary = true;}
			    }

			    if (foundSecondary==false)
				      System.out.println("Secondary type not found. Make sure no capitals are used.");
			}    
			    
		}

		if ((foundPrimary==true)&&(foundSecondary==true)&&(dualType==true))
			System.out.println("Both types found. Pokemon is " + primary + "/" + secondary + ".");
 	
	}

	while (stop==false);
    
    }

}