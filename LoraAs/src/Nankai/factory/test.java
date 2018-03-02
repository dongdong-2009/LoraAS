package Nankai.factory;

public class test {

	public static void main(String[] args) {
		System.out.println(BasicFactory.class.getClassLoader().getResource("config.properties"));

	}

}
