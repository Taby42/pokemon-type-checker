import java.util.*;

public class typescmd
{

    public static void main(String[] args)
    {

    	boolean stop=false;

		String[] types = {"fire", "water", "electric", "normal", "flying", "rock", "ground", "steel", "dark", "psychic", "grass", "bug", "poison", "dragon", "ghost", "ice", "fighting"};
		boolean foundPrimary = false;
		boolean foundSecondary = false;
		boolean dualType = false;
		String primary = "";
		String secondary = "";

		if (args.length==0)
		    System.out.println("Please enter some types.");
		else
		{
		primary = args[0];

		if (args.length>1)
		{
		    secondary = args[1];
		    dualType = true;
		}

		if (args.length>2)
		    System.out.println("More than two words have been entered. Ignoring other words.");

		      for (int i=0; i<types.length; i++)
			    {
				  if (types[i].equals(primary))
				      {System.out.println("Primary type found: " + primary);
				      foundPrimary = true;}
			    }

			    if (foundPrimary==false)
				      System.out.println("Primary type not found. Make sure no capitals are used.");

		      if (dualType==true)
		      {
		      for (int i=0; i<types.length; i++)
			    {
				  if (types[i].equals(secondary))
				      {System.out.println("Secondary type found: " + secondary);
				      foundSecondary = true;}
			    }

			    if (foundSecondary==false)
				      System.out.println("Secondary type not found. Make sure no capitals are used.");
			}    

		if ((foundPrimary==true)&&(foundSecondary==true)&&(dualType==true))
			System.out.println("Both types found. Pokemon is " + primary + "/" + secondary + ".");
		}
    }

}