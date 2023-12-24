
public class Student {

     String name, qualification;;
     int yop;
     double perc;
     Student(String n,String q,int y,double p){
    	 this.name=n;
    	 this.qualification=q;
    	 this.yop=y;
    	 this.perc=p;
     }
     void Studentdetails()
     {
         System.out.println("name:"+this.name);
    	 System.out.println("qualification:"+this.qualification);
    	 System.out.println("yop:"+this.yop);
    	 System.out.println("perc:"+this.perc);
    	 public static void main(String[] args)
    	 {
    	 Student s1=new Student("sasi","b-tech",2022,78);
    	 Student s2=new Student("honey","b-tech",2022,78);
    	 Student s3=new Student("roopa","b-tech",2022,78);
    	 Student s4=new Student("hema","b-tech",2022,78);
    	 Student x[]= {s1,s2,s3,s4};
    		 for(int i=0;i<=x.length-1;i++) {
    			 x[i].Studentdetails();
    			
    		 }
     }


    		 
    		 
    		 
    		 
    		 
    		 
    		 
    		 
    		 
    		 
    	 }
    	 
     
     
     
	}

}
