package Feb23.Day02;

public class WithThisK {
	int rollno;
	String name;
	float fee;

	WithThisK(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
		void display(){
			System.out.println(rollno+"Name : "+name+" "+fee);
			
		}


	public static void main(String[] args) {
		WithThisK w1=new WithThisK(101,"Kaushik",6000f);
		WithThisK w2=new WithThisK(102,"Chetan",7000f);
		w1.display();
		w2.display();
		
	}

}
