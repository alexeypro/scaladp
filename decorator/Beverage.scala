trait Beverage {
	protected var cost = 0.0
	protected var name = "Unknown Beverage"

	override def toString = this.name + " ($" + this.cost + ")"
	def getCost = this.cost
}
