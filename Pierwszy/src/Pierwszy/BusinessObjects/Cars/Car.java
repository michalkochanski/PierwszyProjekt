package Pierwszy.BusinessObjects.Cars;

public class Car {

	//pola statyczne
	
	//pola prywatn
		private String mark;
		private String regnumber;
	

	//konstruktory
		public Car(String mark, String regnumber)
		{
			this.mark = mark;
			this.regnumber = mark;
		}
		
		public Car()
		{
			this("","");
		}
		
	//właściwości
		public String getMark() {
			return mark;
		}

		public void setMark(String mark) {
			this.mark = mark;
		}

		public String getRegnumber() {
			return regnumber;
		}

		public void setRegnumber(String regnumber) {
			this.regnumber = regnumber;
		}
		
	//metody
		public void printData()
		{
			System.out.println("marka: "+mark);
		}
}