// adapter from english to russian
class RussianAdapter extends Language {
	private val lang = new Russian
	def sayHello { this.lang.sayPrivet }
}
