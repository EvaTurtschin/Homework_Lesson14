public class Homework_Lesson14
{
    public static void main(String[] args)
    {
        /* Task1
        Доделать задачу про равенство двух массивов целых чисел ( см. код занятия for_each DEmo)*/

        int[]array1 = {3,6,8};
        int[]array2 = {3,5,8};
        System.out.println("It is "+ areEqual(array1,array2) + " that the two arrays are equal.");

        /* Task2
        Есть массив целых чисел. Написать метод, находящий и возвращающий количество четных чисел
        в этом массиве. Пример: {1, 2, 8, 7} -> количество четных чисел = 2.*/

        int[]array3 = {8, 68, 35, 77, 98, 44, 2};
        System.out.println("The amount of even numbers in the array = " + evenNumber(array3));

    }
        public static boolean areEqual (int[] array1, int[] array2)
        {
            if (array1.length != array2.length)
            {
                return false;
            }
            for (int i=0, j=0; i<array1.length && j<array2.length; i++, j++)
            {
                if (array1[i] != array2[j] )
                    return false;
            }
            return true;
        }

        public static int evenNumber (int[]array3)
        {
            int j=0;
            //for (int i = 0; i< array3.length; i++)
            for (int i : array3)
            {
                if (i%2 == 0)
                {
                    j++;
                }
            }
            return j;
        }


}
