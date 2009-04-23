// adapter from english to french
class FrenchAdapter extends Language {
	private val lang = new French
	def sayHello { this.lang.sayBonjour }
}
