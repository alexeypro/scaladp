class RemoteControl(var command: Command) {
	
	def this() = this(null)

	def pushButton():Unit = {
		if (command == null) 
			println("Sorry, remote control is not programmed yet!")
		else	this.command.execute()
	}

	def programButton(cmd: Command):Unit = { this.command = cmd }
}
		
