package chapter20;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/7
 */
interface Payable<T> {}

class Employee implements Payable {}

class Hourly extends Employee implements Payable {}



public class MultipleInterfaceVariants {

}
