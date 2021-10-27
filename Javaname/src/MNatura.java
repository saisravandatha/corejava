
public class MNatura {
	
	int natural(int number)
	{
		int sum = 0;
		for(int i=1;i<=number;i++)
		{
			if(i%3== 0 && i%5 ==0)
			{
				sum = sum+i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MNatura m= new MNatura();
		System.out.println(m.natural(30));
	}

}
