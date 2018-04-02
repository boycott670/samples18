package com.nespresso.sofa.recruitment.navalbattles.batteau;

public class Ship implements Comparable<Ship>
{
	private double displacement;
	private int mast;
	int cannons;
	
	public Ship(double displacement, int mast, int cannons)
	{
		this.displacement = displacement;
		this.mast = mast;
		this.cannons = cannons;
	}

	public Ship(double displacement, int mast)
	{
		this(displacement, mast, 0);
	}
	
	public double speed ()
	{
		return displacement / mast * (1 + .5 * cannons / 100);
	}

	@Override
	public int compareTo(Ship other)
	{
		// TODO Auto-generated method stub
		return Double.compare(speed(), other.speed());
	}
}
