package task2;

public class Vector2D extends Norm
{
	private double x,y;
	public Vector2D(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	@Override
	public double calculateNorm()
	{
		double module = calculateModule();
		return module*module;
	}

	@Override
	public double calculateModule()
	{
		return Math.sqrt(x*x + y*y);
	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Vector2D vec)
			return this.x == vec.x && this.y == vec.y;
		return super.equals(obj);
	}

	@Override
	public String toString()
	{
		return "Vector2D [x=" + x + ", y=" + y + "]";
	}
}
