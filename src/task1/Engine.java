package task1;

public class Engine
{
	private final double power;
	public Engine(double power)
	{
		this.power = power;
	}

	public double getPower()
	{
		return power;
	}

	public void Show()
	{
		System.out.println("Engine");
		System.out.printf("Engine Power: %.2f h.p.\n\n", getPower());
	}
}
