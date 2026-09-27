package task1;

public class JetEngine extends Engine
{
	private final double thrust;
	public JetEngine(double power, double thrust)
	{
		super(power);
		this.thrust = thrust;
	}

	public double getThrust()
	{
		return thrust;
	}

	@Override
	public void Show()
	{
		System.out.println("Jet Engine");
		System.out.printf("Engine Power: %.2f h.p. \nThrust: %.2f kN\n\n", getPower(), getThrust());
	}
}
