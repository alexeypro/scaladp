class MozzarellaCheese extends Cheese {
	this.name = "Mozzarella"
}

class CheddarCheese extends Cheese {
	this.name = "Cheddar"
}

class TomatoSauce extends Sauce {
	this.name = "Tomato"
}

class PestoSauce extends Sauce {
	this.name = "Pesto"
}

class MozzarellaTomatoPizza extends Pizza {
	this.cheese = new MozzarellaCheese()
	this.sauce = new TomatoSauce()
	this.name = "Mozarella&Tomato"
}

class CheddarPestoPizza extends Pizza {
	this.cheese = new CheddarCheese()
	this.sauce = new PestoSauce()
	this.name = "Cheddar&Pesto"
}

object Demo {
	def main(args : Array[String]) {
		val pizza1:Pizza = new MozzarellaTomatoPizza()
		println(pizza1)
		pizza1.prepare

		val pizza2:Pizza = new CheddarPestoPizza()
		println(pizza2)
		pizza1.prepare
	}
}
