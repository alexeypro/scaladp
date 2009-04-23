class GameMachine {
	// nobody wins by default :-)
	private var currentState: State = new Looser	
	private var quarterInMachine = false

	def insertQuarter { this.quarterInMachine = true }

	def play {
		if (this.quarterInMachine) {
			this.quarterInMachine = false
			var rand: scala.util.Random = new scala.util.Random()
			if (rand.nextInt % 2 == 0)
				this.currentState = new Winner
			else
				this.currentState = new Looser
			this.currentState.result
		} else {
			println("Hey, no cheating, put quarter first!")
		}
	}
}
