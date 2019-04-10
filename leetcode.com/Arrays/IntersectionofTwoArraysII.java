package Arrays;

public class IntersectionofTwoArraysII 
{
	public int[] intersect(int[] nums1, int[] nums2) 
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length, len2 = nums2.length,p1=0,p2=0,k=0;
        int len = len1<len2?len1:len2;
        int res[] = new int[len];
        while(p1<len1&&p2<len2)
        {
            if(nums1[p1]==nums2[p2])
            {
                res[k++]=nums1[p1];
                p1++;p2++;
            }
            else if(nums1[p1]>nums2[p2])
            {
                p2++;
            }
            else
            {
                p1++;
            }
        }
        return Arrays.copyOf(res,k);
    }
}
