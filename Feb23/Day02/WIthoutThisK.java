package Feb23.Day02;

public class WIthoutThisK {
	int rollno;
	String name;
	float fee;

	WIthoutThisK(int rollno,String name,float fee){
		rollno=rollno;
		name=name;
		fee=fee;
	}
		void display(){
			System.out.println(rollno+"Name"+name+" "+fee);
			
		}


	public static void main(String[] args) {
		WIthoutThisK w1=new WIthoutThisK(101,"Kaushik",6000f);
		WIthoutThisK w2=new WIthoutThisK(102,"Chetan",7000f);
		w1.display();
		w2.display();
		
	}

}
