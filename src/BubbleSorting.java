public class BubbleSorting {
    public static void main(String[] args) {
        int arr[] = {9, 2, 1, 7, 8};
        int temp;

        System.out.println("Before sorting");
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Sorting Algorithm

        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 1; j<arr.length-i; j++)
            {
                if(arr[j-1]>arr[j])
                {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After Sorting");
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
