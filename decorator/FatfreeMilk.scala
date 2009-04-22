// tasty ingredient to mix with espresso
class FatfreeMilk(beverage: Beverage) extends Ingredient {
	this.name = "Milk 0%"
	this.cost = 0.19

	override def toString = this.beverage + " + " + this.name + " ($" + this.cost + ")"
	override def getCost = this.beverage.getCost + this.cost
}
	
