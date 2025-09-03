public class TaskCLI {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Task Cli App - No commands provided. Use 'help' to see available commands.");
			return;
		}

		String commands = args[0];

		switch (commands) {
			case "add":
				System.out.println("Adding a new task...");
				break;
			case "list":
				System.out.println("Listing all tasks...");
				break;
			case "remove":
				System.out.println("Removing a task...");
				break;
			case "help":
				System.out.println("Available commands: add, list, remove, help");
				break;
			default:
				System.out.println("Unknown command. Use 'help' to see available commands.");
				break;
			}
	}
}
