public class MergeSorting {

    void Merge(int arr[], int l, int mid, int r)
    {
        int s1 = mid - l + 1;
        int s2 = r - mid;

        int arrL[] = new int[s1];
        int arrR[] = new int[s2];

        int i = 0, j = 0, k = l;

        while(i<s1 && j<s2)
        {
            if(arrL[i] < arrR[j])
            {
                arr[k] = arrL[i];
                i++;
            }
            else {
                arr[k] = arrR[j];
                j++;
            }
            k++;
        }

        while(i<s1)
        {
            arr[k] = arrL[i];
            i++;
            k++;
        }
        while(i<s2)
        {
            arr[k] = arrL[j];
            j++;
            k++;
        }
    }
    void Sort(int arr[], int l, int r)
    {
        if(l<r)
        {
            int mid = (l + (r - l)/2);
            Sort(arr, mid, l);
            Sort(arr, mid+1, r);


            Merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args) {

        MergeSorting ms = new MergeSorting();
        int arr[] = {4, 1, 8, 5, 3, 9};

        int n = arr.length;

        ms.Sort(arr, 0, n-1);
        for (int i = 0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
