namespace Task1;

internal class Program
{
    static void Main()
    {
        Foo(1, 2, 3, 4, 5);
    }

    static void Foo(params int[] ints)
    {
        int min = ints.Min();
        int max = ints.Max();

        int sum = ints.Sum();
        int product = ints.Aggregate((x, y) => x * y);

        Console.WriteLine($"Min: {min}");
        Console.WriteLine($"Max: {max}");

        Console.WriteLine($"Sum: {sum}");
        Console.WriteLine($"Product: {product}");
    }
}
