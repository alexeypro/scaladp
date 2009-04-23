// adapter from english to german
class GermanAdapter extends EnglishLanguage {
	private val lang = new German
	override def sayHello { this.lang.sayGutenTag }
}
