
class ICARE{
	class HIT{
		public void cse(){
			System.out.println("Computer Science Engineering");
		}

		public void ece(){
			System.out.println("Electronics and Communication Engineering");
		}

		public void ee(){
			System.out.println("Electrical Engineering");
		}

		public void me(){
			System.out.println("Mechanical Engineering");
		}


	}
}
public class College{
	public static void main(String[] args) {
		ICARE.HIT obj=new ICARE().new HIT();

		obj.cse();
		obj.ece();
		obj.ee();
		obj.me();

	}
}
