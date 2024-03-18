namespace Task2;

internal class Program
{
    static void Main()
    {
        var arr = new long[] { 1, 2, 3, 4, 5 };

        var res = RemoveElement(arr, 5);

        Console.WriteLine(string.Join(", ", res));
    }

    static long[] RemoveElement(long[] array, long element)
    {
        for (int i = 0; i < array.Length; i++)
        {
            if (array[i] == element)
            {
                long[] newArray = new long[array.Length - 1];
                int index = 0;
                for (int j = 0; j < array.Length; j++)
                {
                    if (i == j)
                    {
                        continue;
                    }
                    else
                    {
                        newArray[index++] = array[j];
                    }
                }

                return newArray;
            }
        }

        return array;
    }
}
