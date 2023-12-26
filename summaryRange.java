import java.util.ArrayList;
import java.util.List;

public class summaryRange {
    public static List<String> SummaryR(int[] nums){
        List<String> list = new ArrayList<>();
        
        StringBuilder str = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            int prevDif = 0;
            int nextDif = 0;

            if(str.length()==0)
                str.append(String.valueOf(nums[i]));
            
            // check previous Difference 
            if(i>0)
                prevDif = nums[i]-nums[i-1];
            
            // check the next Difference 
            if(i<nums.length-1)
                nextDif = nums[i+1]-nums[i];
            
            if(prevDif==1 & nextDif!=1){
                str.append("->"+nums[i]);
                list.add(str.toString());
                str.setLength(0);
            }

            if(prevDif!=1 & nextDif!=1){
                list.add(str.toString());
                str.setLength(0);
            }
        }
            

        return list;
            
        
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,4,5,7};
        List<String> list = SummaryR(arr);
        System.out.println("List Strings are ::");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
    
}