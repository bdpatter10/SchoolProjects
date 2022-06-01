public class isValid
{
public static boolean IsValidMod10Number(String number) 
{
if(number.length() < 15) {
	
	return false;
}

int [] numberArray = new int[number.length()]; 
boolean checkBit = false;
int sumTotal =0;
int myInt = 0;
System.out.println("number: " + number);
for(int i=0; i < number.length() ; i++) 
{
	numberArray[i] = (int) number.charAt(i) - '0'; 
}
for(int index = numberArray.length -1 ; index >= 0 ; index--) 
{
	if(checkBit)
	{
		numberArray[index] *=2;
		if(numberArray[index] > 9)
		{
			myInt = 0;
			//numberArray[index] -= 9; 
			myInt += numberArray[index]%10;
			myInt += numberArray[index]/10;
			numberArray[index] = myInt;
		}
	}
	
	sumTotal += numberArray[index];
	checkBit = !checkBit; 
}
return sumTotal % 10 == 0;
}
}