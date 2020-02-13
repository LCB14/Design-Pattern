package com.lcb.adapter_pattern_instance;
//对象适配器
/**
 * 
 * 对象适配器和类适配器其实算是同一种思想，只不过实现方式不同。 
 * 根据合成复用原则，组合大于继承，所以它解决了类适配器必须继承src的局限性问题，也不再强求dst必须是接口。
 * =====================================================================================
 * 和装饰者模式初学时可能会弄混，这里要搞清，装饰者是对src的装饰，使用者毫无察觉到src已经被装饰了（使用者用法不变）。 
 * 这里对象适配以后，使用者的用法还是变的。 
 * */
public class AdapterPattern {

	public static void main(String[] args) {
		
		System.out.println("\n===============对象适配器==============");
        VoltageAdapter2 voltageAdapter2 = new VoltageAdapter2(new Voltage220());
        Mobile mobile2 = new Mobile();
        mobile2.charging(voltageAdapter2);

	}

}
