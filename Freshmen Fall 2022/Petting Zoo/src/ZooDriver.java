
public class ZooDriver {

		public static void main(String[] args) {
			Animals Jerry = new Animals("Sheep","Jerry","Baaaaaaah", "Rolls");
			Animals Butterball = new Animals("Sheep","Butterball","Baaaaaaaggh", "Rolls");
			Animals Penny = new Animals("Penguin","Penny","*Penguing Noises*", "Wobbles");
			Animals Bingo = new Animals("Flamingo","Bingo","*Pecks you*", "Strides");
			Animals Javvy = new Animals("Parrot","Javvy","Javvy want an A", "Flies");
			Animals Butterscotch = new Animals("Snake","Butterscotch","*sssssssssss*", "Slithers");
			
			
			System.out.println("[*]The animals in our zoo are:");
			System.out.printf("[*]%s\n", Butterball.toString());
			System.out.printf("[*]%s\n", Butterscotch.toString());
			System.out.printf("[*]%s\n", Penny.toString());
			System.out.printf("[*]%s\n", Bingo.toString());
			System.out.printf("[*]%s\n", Javvy.toString());
			System.out.printf("[*]%s\n", Butterscotch.toString());
			
			String samespecies = (Jerry.IsSameSpecies(Butterball)) ? "is" : "is NOT";
			System.out.printf("[*]%s %s the same species as %s\n", Jerry.GetName(),samespecies,Butterball.GetName());
			samespecies = (Penny.IsSameSpecies(Bingo)) ? "is" : "is NOT";
			System.out.printf("[*]%s %s the same species as %s\n", Penny.GetName(),samespecies,Bingo.GetName());
			
			System.out.println("[*]Lets pet our animals!");
			System.out.printf("[*]Petting %s:\n", Jerry.GetName());
			Jerry.Pet();
			System.out.printf("[*]Petting %s:\n", Bingo.GetName());
			Bingo.Pet();
			System.out.printf("[*]Petting %s:\n", Javvy.GetName());
			Javvy.Pet();
			
			Butterscotch.SetName("Steve");
			
			System.out.printf("[*]Look! ");
			Butterscotch.Move();
			
			System.out.printf("[*]Now look! ");
			Penny.Move();
		}

	}


