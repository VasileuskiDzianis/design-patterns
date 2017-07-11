package patterns.creational.factorymethod;

public class Program {

	public static void main(String[] args) {
		DeveloperFactory developerFactory = createDeveloperFactoryBySpecialty("php");
		Developer developer = developerFactory.createDeveloper();

		developer.writeCode();

	}

	static DeveloperFactory createDeveloperFactoryBySpecialty(String specialty) {

		switch (specialty.toLowerCase()) {
		case "java": {

			return new JavaDeveloperFactory();
		}
		case "c++": {

			return new CppDeveloperFactory();
		}
		default: {

			throw new RuntimeException(specialty + " is unknown specialty.");
		}
		}
	}
}
