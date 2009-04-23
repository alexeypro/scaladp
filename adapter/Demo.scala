object Demo {
	def main(args : Array[String]) {
		var e = new EnglishLanguage
		print("We speak only English: ")
		e.sayHello	

		e = new GermanAdapter
		print("But also some German: ")
		e.sayHello

		e = new FrenchAdapter
		print("A little bit of French: ")
		e.sayHello
		
		e = new RussianAdapter
		print("And of course Russian: ")
		e.sayHello
	}
}
