package Pierwszy.BusinessObjects.Cars;

public class Car {

	//pola statyczne
	
	//pola prywatne
		private String mark;
		private String regnumber;
	
	//pola publiczne X
		//sobie testuję
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