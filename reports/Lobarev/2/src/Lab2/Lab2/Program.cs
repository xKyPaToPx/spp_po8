namespace Task1;

internal class Program
{
    static void Main()
    {
        var path = @"..\..\..\Text.txt";

        var reader = new StreamReader(path);

        string? temp;
        while ((temp = reader.ReadLine()) != null)
        {
            var lex = temp.Trim().Split(' ', StringSplitOptions.RemoveEmptyEntries);
            Console.WriteLine(string.Join(" ", lex.Reverse()));
        }
    }
}
