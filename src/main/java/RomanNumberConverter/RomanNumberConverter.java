public class RomanNumberConverter {

    public int convert(String romanNumber)
    {
	if (romanNumber == "I")
	    {
		return 1;
	    }
	else if (romanNumber== "V")
	    {
		return 5;
	    }
	else if(romanNumber== "X")
            {
		return 10;
            }
	else if(romanNumber== "L")
            {
		return 50;
            }
	else if(romanNumber== "C")
            {
		return 100;
            }
	else if(romanNumber== "D")
            {
		return 500;
            }
	else if(romanNumber== "M")
            {
		return 1000;
            }
	else
            {
        throw new IllegalArgumentException("Pas un chiffre romain");
            }
    }
   
}

