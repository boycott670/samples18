package com.nespresso.sofa.recruitment.navalbattles.app;

import java.util.Arrays;

import com.nespresso.sofa.recruitment.navalbattles.batteau.Ship;

public final class Race
{
	private final Ship[] ships;

	public Race(Ship... ships)
	{
		this.ships = ships;
	}
	
	public Ship winner ()
	{
		return Arrays.stream(ships).sorted().findFirst().get();
	}
}
