public class QuickSort {

    void Sort(int arr[], int Left, int Right)
    {
        if(Left<Right)
        {
            int si = Left;
            int ei = Right;
            int mid = si + (ei - si)/2;
            int pivot = arr[mid];

            while(si<=ei)
            {
                while(arr[si]<pivot)
                {
                    si++;
                }
                while(arr[ei]>pivot)
                {
                    ei--;
                }
                if(si<=ei)
                {
                    int temp = arr[si];
                    arr[si++] = arr[ei];
                    arr[ei--] = temp;
                }
            }
            Sort(arr, Left, ei);
            Sort(arr, si, Right);
        }
    }

    void Display(int arr[])
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();

        int arr[] = {7, 2, 4, 1, 9, 3, 5};

        int n = arr.length;

        qs.Sort(arr, 0, n-1);
        qs.Display(arr);
    }
}
