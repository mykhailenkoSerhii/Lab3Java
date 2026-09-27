package task3;

public class Vector3D implements INorm
{
	private double x, y, z;
	public Vector3D(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public double getZ()
	{
		return z;
	}

	@Override
	public double calculateModule()
	{
		return Math.max(Math.abs(x), Math.max(Math.abs(y), Math.abs(z)));
	}

	@Override
	public double calculateNorm()
	{
		double module = calculateModule();
		return module * module;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Vector3D vec)
			return this.x == vec.x && this.y == vec.y && this.z == vec.z;
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Vector3D [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
}
