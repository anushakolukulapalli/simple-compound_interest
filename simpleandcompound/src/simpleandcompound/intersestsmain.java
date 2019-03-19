package simpleandcompound;

public class intersestsmain {
	public static void main(String[] args)
	{
		CalculateInterest  calin=new CalculateInterest();
		System.out.println(calin.cal_simple(3000,2,10));
		System.out.println(calin.cal_compound(3000, 2, 10, 2));
	}

}
