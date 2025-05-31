public class SearchInRotatedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[] {5,6,7,8,9,10,1,2,3}, 0,8,7));
    }


    public static int search(int[] arr, int l , int r, int elementToFind){
        int pivot = getPivot(arr, l , r);
        int location = BinarySearch(arr, l, pivot, elementToFind);
        if(location == -1){
            location = BinarySearch(arr, pivot+1, r, elementToFind);
        }
        return location;
    }

    public static int getPivot(int[] arr, int l, int r){
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid+1]<arr[mid]) {
                return mid;
            } else if(arr[mid]<arr[mid-1]){
                return mid-1;
            } else if(arr[mid]>arr[l]){
                l = mid+1;
            } else if(arr[mid]<arr[r]){
                r=mid-1;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] arr, int l , int r ,int num){

        while(l<=r) {
            int mid= (l+r)/2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                r = mid - 1;
            } else
                l = mid + 1;

        }
        return -1;
    }

}
