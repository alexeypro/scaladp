class PlayButton extends Command {
	def execute():Unit = println("Play button pressed, we are doing something here...")
}

class TurnOnLightButton extends Command {
	def execute():Unit = println("We are turning on the light, please hold on!...")
}

object Demo {
	def main(args : Array[String]) {
		val remote = new RemoteControl
		remote.pushButton

		remote.programButton(new PlayButton)
		remote.pushButton

		remote.programButton(new TurnOnLightButton)
		remote.pushButton

	}
}
