trait Pizza {
	protected var name = "Unknown"
	protected var cheese: Cheese = null
	protected var sauce: Sauce = null
	def prepare:Unit = {
		println("Putting " + this.sauce + " on the crust")
		println("Adding " + this.cheese + " to our pizza")
		// cooking here
		println("Done!")
		println
	}
	override def toString = "Cooking pizza " + this.name + " with " + this.cheese + " and " + this.sauce
}
