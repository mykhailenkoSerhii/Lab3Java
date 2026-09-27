import task1.CombustionEngine;
import task1.DieselEngine;
import task1.Engine;
import task1.JetEngine;
import task2.Norm;
import task2.Vector2D;
import task2.Vector3D;
import task3.INorm;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the desired task: ");
		int task = scanner.nextInt();
		if(task == 1)
			task1(scanner);
		else if(task == 2)
			task2(scanner);
		else if(task == 3)
			task3(scanner);
	}

	public static void task1(Scanner scanner)
	{
		Engine[] engineArray = new Engine[4];

		System.out.println("Engine 1 - Base Engine");
		System.out.println("Input engine power in horsepower: ");
		double power = scanner.nextInt();
		engineArray[0] = new Engine(power);

		System.out.println("Engine 2 - Combustion Engine");
		System.out.println("Input engine power and volume: ");
		power = scanner.nextInt();
		double volume = scanner.nextInt();
		engineArray[1] = new CombustionEngine(power, volume);

		System.out.println("Engine 3 - Diesel Engine");
		System.out.println("Input engine power, volume and torque: ");
		power = scanner.nextInt();
		volume = scanner.nextInt();
		double torque = scanner.nextInt();
		engineArray[2] = new DieselEngine(power, volume, torque);

		System.out.println("Engine 4 - Jet Engine");
		System.out.println("Input engine power and thrust: ");
		power = scanner.nextInt();
		double thrust = scanner.nextInt();
		engineArray[3] = new JetEngine(power, thrust);

		for(Engine engine : engineArray)
			engine.Show();
	}

	public static void task2(Scanner scanner)
	{
		Norm[] normArray = new Norm[3];
		normArray[0] = new Vector2D(3, 4);
		normArray[1] = new Vector3D(3, 4, 5);
		normArray[2] = new Vector2D(1,5);

		for(Norm norm : normArray)
		{
			System.out.println(norm.toString());
			System.out.printf("Module: %.2f\nNorm: %.2f\n\n",
					norm.calculateModule(), norm.calculateNorm());
		}
	}

	public static void task3(Scanner scanner)
	{
		INorm[] normArray = new INorm[3];
		normArray[0] = new task3.Vector2D(3, 4);
		normArray[1] = new task3.Vector3D(3, 4, 5);
		normArray[2] = new task3.Vector2D(1,5);

		for(INorm norm : normArray)
		{
			System.out.println(norm.toString());
			System.out.printf("Module: %.2f\nNorm: %.2f\n\n",
					norm.calculateModule(), norm.calculateNorm());
		}
	}
}
