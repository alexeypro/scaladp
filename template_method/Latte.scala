trait Latte {

	def prepare {
		this.prepareCup
		this.addEspresso
		this.addSyrup
		this.addMilk
		this.giveCustomer
	}

	protected def prepareCup { print("Preparing cup, ") }
	protected def addEspresso { print("adding espresso shot, ") }
	protected def giveCustomer { println("okay - your drink is ready!") }
	
	protected def addSyrup:Unit
	protected def addMilk:Unit
}
