// tasty ingredient to mix with espresso
class WholeMilk(beverage: Beverage) extends Ingredient {
	this.name = "Whole Milk"
	this.cost = 0.59

	override def toString = this.beverage + " + " + this.name + " ($" + this.cost + ")"
	override def getCost = this.beverage.getCost + this.cost
}
	
