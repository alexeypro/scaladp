object Demo {
	def main(args : Array[String]) {
		var drink: Latte = new WholeMilkVanilla
		drink.prepare

		drink = new FatfreeMilkCaramel
		drink.prepare
	}
}
