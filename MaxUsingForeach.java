class MaxUsingForeach{
	public static int maximum(int[] numbers){ 
        int max = numbers[0];
         // for each loop
        for (int num : numbers)
            if (num > max)
                 max = num;
            
        return max;
       }
    public static void main(String[] arg){
        {
            int[] data = { 888,100,234,5756,423,125, 666,333,116, 110 };
              
            int highest = maximum(data);
            System.out.println("The highest value is " + highest);
        }
    }
 }
 