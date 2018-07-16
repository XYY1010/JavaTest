package com.xyy.test13;

interface Payable<T> {}

class Empolyee implements Payable<Employee> {}

// class Hourly extends Empolyee implements Payable<Hourly> {}
/* Hourly不能编译，因为檫除会将 Payable<Employee>和 Payable<Hourly>简化为相同
 * 的类 Payable，这样，上面的代码就意味着在重复两次地实现相同的接口。十分有趣的是，
 * 如果从Payable 的两种用法中都移除掉泛型参数（就像编译器在檫除阶段所做的那样）
 * 这段代码就可以编译。
 */

public class MultipleInterfaceVariants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
