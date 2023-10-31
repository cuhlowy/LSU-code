
public class Animals {
	 String Species = "";
	    String Name = "";
	    String PetResult  = "";
	    String Movement = "";

	    public Animals(String Species, String Name, String PetResult, String Movement) {
	        this.Species = Species;
	        this.Name = Name;
	        this.PetResult = PetResult;
	        this.Movement = Movement;

	    }

	    /*
		 * GetSpecies - Gets animal species name
		 * @return - Returns species name
		 */
	    public String GetSpecies() {
	        return this.Species = Species;
	    }
	    /*
		 * GetName - Gets animal name
		 * @return - Returns animal name
		 */
	    public String GetName() {
	        return this.Name = Name;
	    }
	    /*
		 * Pet - Prints out the animal's noise
		 */
	    public void Pet() {
	        System.out.println(PetResult);
	    }
	    /*
		 * IsSameSpecies - Checks if two animals are the same species
		 * @param Animals - The animal object that is being compared
		 * @return - Returns true if they are the same species / Returns false if they are different species
		 */
	    public boolean IsSameSpecies(Animals other) {
	        if (other.GetSpecies().equals(Species)) {
	            return true;
	        }
	        return false;
	    }
	    /*
		 * SetName - Sets the name of the animal
		 * @newName - The new name that will be set to the animal
		 * @return - Returns the new animal name
		 */
	    public String SetName(String newname) {
	        return this.Name = newname;
	    }
	    /*
		 * toString - Gets the name of the animal and species
		 * @return - Returns the name and the species of the animal
		 */
	    public String toString() {
	        String NameSpecies = Name + ", a " + Species;
	        return NameSpecies;
	    }
	    /*
		 * Move - Prints out the name and movement of the animal
		 */
	    public void Move() {
	    	System.out.println(Name +" "+ Movement + " around!");
	    }
	    
}



	