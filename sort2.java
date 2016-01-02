//二分法插入排序
import java.util.Arrays;

public class sort2 {
	private static void sort(int a[]){
		for(int i=1;i<a.length;i++){
			int temp=a[i];
			int left=0;
			int right=i-1;
			int mid;
			while(left<=right){
				mid=(left+right)/2;
				if(temp<a[mid]){
					right=mid-1;
				}
				else{
					left=mid+1;
				}
			}
			
			for(int j=i-1;j>=left;j--){
				a[j+1]=a[j];
			}
			
			if(left!=i){
				a[left]=temp;
			}
		}
	}
	
   public static void main(String[] args) {
	   int a[]={42,45,12,34,56,78,89,32,10,58};
	   sort(a);
	   System.out.println(Arrays.toString(a));
	
   }
}
