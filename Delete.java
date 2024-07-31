
public class Delete{

   public static void main(String[] args) {
    int[] arr= {5,10,20,30,40};
    int[] temp= new int[arr.length-1];
    int uIn=2;
     int Index=0;
    for(int i=0;i<arr.length;i++) {
    	if(i!=uIn)
    		temp[Index++]=arr[i];
    }
    arr=temp;
    temp=new int(arr.length-1);
	for (int a:arr) {
		System.out.println(a);
    				}
    
    }
    	
    }
    

    	
    		
  
    

