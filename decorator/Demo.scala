object Demo {
	def main(args : Array[String]) {
		val latte = new WholeMilk(new IllyEspresso())
		println("Latte: " + latte + " so please pay now $" + latte.getCost)
		val caramelLatte = new FatfreeMilk(new Caramel(new LavazzaEspresso()))
		println("Caramel Latte: " + caramelLatte + " so please pay now $" + caramelLatte.getCost)
	}
}
