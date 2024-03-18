namespace Task3;

internal class Program
{
    static void Main()
    {
        var str = RandomString(128, false);
        Console.WriteLine(str);
    }

    static string RandomString(int lenght, bool asciiOnly)
    {
        if (asciiOnly)
        {
            return RandomASCIIString(lenght);
        }

        int min = 0;
        int max = 255;

        char[] chars = new char[lenght];

        var rand = new Random();

        for (int i = 0; i < lenght; i++)
        {
            char character = (char)rand.Next(min, max + 1);
            chars[i] = character;
        }

        return new string(chars);
    }

    static string RandomASCIIString(int lenght)
    {
        int min = 0x0000;
        int max = 0x007F;

        char[] chars = new char[lenght];

        var rand = new Random();

        for (int i = 0; i < lenght; i++)
        {
            char character = (char)rand.Next(min, max + 1);
            if (!char.IsAscii(character))
            {
                Console.WriteLine((int)character);
            }
            chars[i] = character;
        }

        return new string(chars);
    }
}
