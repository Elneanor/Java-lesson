
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

//�̳���  �������ж���һ���븸��ͬ�����������ͣ��������;���ͬ��һ����������Ϊ�����ĸ��ǡ������ĸ��Ƿ����������븸��֮�䡣���⣬����super�ṩ�Ը���ķ���.
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

