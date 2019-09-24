package inheretance;

public class regularmulti {
	
	public void car()
	{
		System.out.println("car");
	}
	public void money()
	{
		System.out.println("money");
	}
	public void house()
	{
		System.out.println("House");
	}
	}

	class son23 extends regularmulti
	{
	public void bike()
	{System.out.println("bike");}
	}
	
	class son25 extends son23
	{
	public void credit_card()
	{System.out.println("credit card");}
	}

