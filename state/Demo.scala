object Demo {
	def main(args : Array[String]) {
		// we will be playing with smart machine which accepts
		// quarters and does not play without them
		// and we (client) cannot choose state -- gambling, you know :-)

		val game = new GameMachine
		game.play
		game.insertQuarter
		game.play
		game.insertQuarter
		game.play
		game.insertQuarter
		game.play
		game.insertQuarter
		game.play
		game.insertQuarter
		game.play
	}
}
