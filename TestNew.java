
class Animal{
	void eat(){
		System.out.println("Animal eat");
	}
	void sleep(){
		System.out.println("Animal sleep");
	}
	void breathe(){
		System.out.println("Animal breathe");
	}
}

//继承类  在子类中定义一个与父类同名，返回类型，参数类型均相同的一个方法，称为方法的覆盖。方法的覆盖发生在子类与父类之间。另外，可用super提供对父类的访问.
class Fish extends Animal{   
	void breathe(){
		System.out.println("fish breathe");
	}
	
}

public class TestNew {
	public static void main(String[] args){
		Animal an = new Animal();
		Fish fn = new Fish();
		
		an.breathe();
		fn.breathe();
	}
}

