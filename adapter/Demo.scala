object Demo {
	def main(args : Array[String]) {
		var e: Language = new English
		print("We know English: ")
		e.sayHello	

		e = new German
		print("Also some German: ")
		e.sayHello

		e = new French
		print("A little bit of French: ")
		e.sayHello
		
		e = new Russian
		print("And of course Russian: ")
		e.sayHello
	}
}
