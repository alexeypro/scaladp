import scala.collection.mutable.HashSet

trait Subject {
	private val observers = new HashSet[Observer]()

	def addObserver(o: Observer) = observers += o
	def removeObserver(o: Observer) = observers -= o
	def notifyObservers = observers.foreach(_.update())
}
