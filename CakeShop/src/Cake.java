//Student Name: Chloe Chin
//LSU ID: 894023599

public class Cake implements Comparable <Cake>
{
	
		private  String flavor;
		private  int tiers;
		private  double price;
		

		public Cake(String flavor, int tiers, double price) {
			super();
			this.flavor = flavor;
			this.tiers = tiers;
			this.price = price;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}

		public int compareTo(Cake o) {
			if(flavor.compareTo(o.flavor) != 0)
				return flavor.compareTo(o.flavor);
				else
				return Double.compare(price, o.price);
		}

		public void printCard() {
			
			System.out.printf("A %d tier %s cake\t\t$%.2f\n" ,tiers,flavor,price);
		}
	
		
	}


