
public class Solver {
	public static Board b;

	Solver(Board b) {
		this.b = b;
	}
	
	public static boolean quadrantContains(int x, int y,int val)
	{
		int Xquad = (int) ((x - (x % Math.sqrt(b.qs))) / Math.sqrt(b.qs));
		int Yquad = (int) ((y - (y % Math.sqrt(b.qs))) / Math.sqrt(b.qs));
		for (int X = 0; X < Math.sqrt(b.qs); X++)
		{
			for (int Y = 0; Y < Math.sqrt(b.qs); Y++)
			{
				if (b.grid[(int) (Math.sqrt(b.qs) * Xquad + X)][(int) (Math.sqrt(b.qs) * Yquad + Y)]==val)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public static void cacPos(){
		
	}
}
