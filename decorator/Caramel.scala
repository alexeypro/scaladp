// tasty ingredient to mix with espresso
class Caramel(beverage: Beverage) extends Ingredient {
	this.name = "Caramel"
	this.cost = 0.15

	override def toString = this.beverage + " + " + this.name + " ($" + this.cost + ")"
	override def getCost = this.beverage.getCost + this.cost
}
	
