// adapter from english to german
class GermanAdapter extends Language {
	private val lang = new German
	def sayHello { this.lang.sayGutenTag }
}
