class Waitress(name: String) extends Observer {
	override def update() = println(name + ": now I know my meal is ready!")
}

class CookingChef extends Subject {
	println("I am an angry chef, and this is my restaraunt!")
}

object Demo {
	def main(args : Array[String]) {
		val c = new CookingChef()
		c.addObserver(new Waitress("Britney"))
		c.addObserver(new Waitress("Helen"))
		// we assume here goes the process of the cooking
		c.notifyObservers
	}
}
