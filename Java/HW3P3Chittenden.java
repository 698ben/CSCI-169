import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int c, n, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[10];

        System.out.println("Enter " + n + " integers in ascending order");

        for (c = 0; c < n; c++)
            array[c] = in.nextInt();

        SortedList s = new SortedList(array);
        System.out.println("Enter value to find");
        search = in.nextInt();
        in.close();
        int spot = s.binsearch(search);
        s.binsearch(search);
        if(spot>=0)
            System.out.println(search + " found at location " + spot + ".");
        else
            System.out.println(search + " is not present in the list.\n");

        s.print();
        SortedList q = new SortedList();
        q.insert(58);
        q.insert(32);
        q.insert(40);
        //q.print();
    }

}

