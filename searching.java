import java.util.*;
import java.util.ArrayList;
public class searching {

    public static ArrayList<Integer> linear2Darraysearch(int[][] arr,int key)
    {
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(key == arr[i][j])
                {
                    list.add(i);
                    list.add(j);
                    return list;
                }
            }
        }
        list.add(-1);
        list.add(-1);
        return list;
    }
    public static int linearsearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static int linearstringsearch(String str,char c)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==c)
            {
                return i;
            }
        }
        return -1;
    }

    public static int binearysearch(int[] arr,int key)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end)
        {
            int mid = end+(start-end)/2;
            if(arr[mid]<key)
            {
                end = mid -1;
            }
            else if(arr[mid]>key)
            {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[][] array = {{1,24,4},{2,3,5},{89,354,65}};
        int key=5;
        int index = linearsearch(arr,key);
        int binery_index = binearysearch(arr,key);
        System.out.println("the index of linear search is "+index+" ,the index of bineary search is "+binery_index +" and they key value was "+key);
        String name = "be the best";
        char search = 's';
        int position = linearstringsearch(name,search);
        System.out.println("the word '"+ name.charAt(position)+"' can be found in the index of "+position);
        ArrayList<Integer> list= linear2Darraysearch(array,key);
        System.out.print("It is present in array");
        for(int i=0;i<list.size();i++)
        {
            System.out.print("["+list.get(i)+"]");
        }

    }

}
