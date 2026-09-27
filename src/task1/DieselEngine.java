package task1;

public class DieselEngine extends CombustionEngine
{
	private final double torque;
	public DieselEngine(double power, double volume, double torque)
	{
		super(power, volume);
		this.torque = torque;
	}

	public double getTorque()
	{
		return torque;
	}

	@Override
	public void Show()
	{
		System.out.println("Diesel Engine");
		System.out.printf("Engine Power: %.2f h.p. \nVolume: %.2f liters \nTorque: %.2f\n\n",
				getPower(), getVolume(), getTorque());
	}
}
