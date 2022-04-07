package jumpStatement;

public class ContinueStatement 
{

	public static void main(String args[]) {
		int i = 1;
		while (true) 
		{
			System.out.print(i + "\t");
			i++;
			if (i <= 20)
				continue;
			else
				break;
		}
	}
}
