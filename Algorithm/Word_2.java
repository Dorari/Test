public class Word_2 {
    public static void main(String[] args) {
    int[] nums = {1, 2, 3, 6, 4, 9, 12, 13, 8};
    System.out.print(" ตำแหน่ง ") ;
    System.out.println(sequentialSearch(nums,9));
   }
   public static int sequentialSearch(int[] elements, int target)
  {
    for (int j = 0; j < elements.length; j++)
    {
      if (elements[j] == target)
      {
        return j;
      }
    }
    return -1;
  }

}
