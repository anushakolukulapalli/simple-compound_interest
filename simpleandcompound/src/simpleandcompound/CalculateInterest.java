package simpleandcompound;
import java.lang.Math;

public class CalculateInterest {
	
    public double cal_simple(double principle_amount,double time,double rate)
    {
    	return (principle_amount*time*rate)/100;
    }
    public double cal_compound(double principle_amount,double time,double rate,double n)
    {
    	//n is the no.of times in a year the interest gets compounded
    	return principle_amount*Math.pow((1+(rate/n)),(time));
    }

}
