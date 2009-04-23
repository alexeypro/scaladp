// adapter from english to russian
class RussianAdapter extends EnglishLanguage {
	private val lang = new Russian
	override def sayHello { this.lang.sayPrivet }
}
