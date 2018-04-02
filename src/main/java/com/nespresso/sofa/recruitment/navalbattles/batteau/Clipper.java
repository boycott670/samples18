package com.nespresso.sofa.recruitment.navalbattles.batteau;

public final class Clipper extends Ship
{
	public Clipper(double displacement, int mast, int cannons)
	{
		super(displacement, mast, cannons);
		// TODO Auto-generated constructor stub
	}

	public Clipper(double displacement, int mast)
	{
		super(displacement, mast);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double speed()
	{
		// TODO Auto-generated method stub
		return (cannons == 0 ? .8 : 1) * super.speed();
	}
}
