int n = Convert.ToInt32(args[0]);
int summary = 0;
for (int i = 0; i < n; i++)
{
    int number = Convert.ToInt32(args[i + 1]);
    if (number < 0)
    {
        summary += number * number;
    }
}

Console.WriteLine($"Result: {summary}");
Console.ReadLine();
