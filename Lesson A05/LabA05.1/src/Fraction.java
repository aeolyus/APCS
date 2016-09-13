/*
 * Represents a fraction with an int numerator and int denominator
 * and provides methods for adding and multiplying fractions.
 *
 * @Author: Richard Huang
 * period 1
 */

public class Fraction {
	private int n,d;//d is always positive
	public Fraction(){
		n=0;
		d=1;
	}
	public Fraction(int n){//sets fraction to number n
		this.n=n;
		d=1;
	}
	public Fraction(int n, int d){//sets fraction to n/d
		this.n=n;
		this.d=d;
	}
	public Fraction(Fraction other){//copies Fraction argument
		this.n=other.getNumerator();
		this.d=other.getDenominator();
	}
	public int getNumerator(){//returns Numerator
		return n;
	}
	public int getDenominator(){//returns Denominator
		return d;
	}
	public double getValue(){//gets the floating point value of fraction
		return (double)n/d;
	}
	public void setNumerator(int n){//sets numerator
		this.n=n;
	}
	public void setDenominator(int d){//sets denominator
		this.d=d;
	}
	public void setFraction(Fraction other){//copies Fraction argument
		this.n=other.getNumerator();
		this.d=other.getDenominator();
	}
	public Fraction add(Fraction other){//adds fraction to another fraction but is not simplified
		Fraction frac = new Fraction(this.n*other.getDenominator()+other.getNumerator()*this.d,this.d*other.getDenominator());
		return frac;
	}
	public Fraction add(int m){//adds a number m to fraction
		n+=d*m;
		Fraction frac=new Fraction(n,d);
		return frac;

	}
	public Fraction multiply(Fraction other){//multiplie a fraction with another fraction
		Fraction frac=new Fraction(n*other.getNumerator(),d*other.getDenominator());
		return frac;
	}
	public Fraction multiply(int m){//multiplies a fraction by a number m
		Fraction frac= new Fraction(this.n*m,this.d);
		return frac;
	}
	public Fraction reduce(){//reduces a fraction to simplest form
		int gcf=MyMathLib.gcf(Math.abs(n), Math.abs(d));
		Fraction frac=new Fraction(this.n/gcf,this.d/gcf);
		return frac;
	}
	public String toString(){//converts Fraction to a string
		if (d < 0) {
			n = -n;
			d = -d;
		}
		Fraction frac = new Fraction(n,d);
		frac=frac.reduce();
		return frac.getNumerator()+"/"+frac.getDenominator();
	}
}
