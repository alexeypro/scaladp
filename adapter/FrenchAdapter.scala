// adapter from english to french
class FrenchAdapter extends EnglishLanguage {
	private val lang = new French
	override def sayHello { this.lang.sayBonjour }
}
