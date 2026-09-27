package task1;

public class CombustionEngine extends Engine
{
	private final double volume;
	public CombustionEngine(double power, double volume)
	{
		super(power);
		this.volume = volume;
	}

	public double getVolume()
	{
		return volume;
	}

	@Override
	public void Show()
	{
		System.out.println("Combustion Engine");
		System.out.printf("Engine Power: %.2f h.p. \nVolume: %.2f liters\n\n", getPower(), getVolume());
	}
}
