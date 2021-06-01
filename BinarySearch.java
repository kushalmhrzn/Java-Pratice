//binary search example
import java.util.*;  
public class BinarySearch {  
public static void main(String[] args) {  
    int[] arr = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100};  //list of array
    int item, location = -1;  //if item is not in array
    System.out.println("Enter the item which you want to search");  //entering the search item
    Scanner sc = new Scanner(System.in);  //creating objects
    item = sc.nextInt();  
    location = binarySearch(arr,0,9,item);  
    if(location != -1)  //incase of item is not available in the list 
    System.out.println("the location of the item is "+location);  
    else   
        System.out.println("Item not found");  
    }  
public static int binarySearch(int[] a, int beg, int end, int item)  
{  
    int mid;  
    if(end >= beg)   //loop of searching item
    {     
        mid = (beg + end)/2;  
        if(a[mid] == item)  
        {  
            return mid+1;  
        }  
        else if(a[mid] < item)   
        {  
            return binarySearch(a,mid+1,end,item);  
        }  
        else   
        {  
            return binarySearch(a,beg,mid-1,item);  
        }  
      
    }  
    return -1;   
}  
}  