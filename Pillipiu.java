import jdk.jshell.SourceCodeAnalysis;

import java.util.ArrayList;
import java.util.Scanner;

public class Pillipiu
{
    public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in);
          int people = sc.nextInt();
          int present = sc.nextInt();
          int mas [] = new int [people];
          int Budget = 0;
          int sum = 0;
          int arr [] = new int [people];
        for (int i = 0; i < people; i++)
        {
            mas[i] = sc.nextInt();
            sum += mas[i];
        }
        if (sum < present)
        {
            System.out.println("IMPOSSIBLE");
        }
        else
        {
            while (present > Budget)
            {
                for (int i = people - 1; i >= 0; i--)
                {
                    if (present != Budget)
                    {
                        if (arr[i] != mas[i])
                        {
                            arr[i] += 1;
                            Budget += 1;
                        }
                    }
                }
            }
            boolean neediteration = true;
            while (neediteration)
            {
                neediteration = false;
                for (int i = 1; i < arr.length; i++)
                {
                    if (arr[i] < arr[i-1])
                    {
                        int t = arr[i-1];
                        arr[i-1] = arr[i];
                        arr[i] = t;
                        neediteration = true;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
}