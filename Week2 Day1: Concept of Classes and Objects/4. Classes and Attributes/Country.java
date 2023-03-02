public class Country{
                String name;
				String CountryCode;
				String isd;
				public Country(){
					this.name="";
					this.CountryCode="";
					this.isd="";
				}
				public Country(String name,String CountryCode,String isd){
					this.name=name;
					this.CountryCode=CountryCode;
					this.isd=isd;
				}	
		void display() {
			System.out.println("Country Name :"+name);
			System.out.println("Country Code :"+CountryCode);
			System.out.println("ISD Code :"+isd);
		}
}
