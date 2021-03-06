/**
 * Объявление пакета, в котором находится класс
 */
package tests;
/**
 * Добавление библиотек для проверки результатов теста
 */
import static org.junit.Assert.*;
/**
 * Добавление библиотек для тестирования
 */
import org.junit.Test;
/**
 * Добавление класса, в котором хранится метод расчета стоимости заказа
 */
import form.Calculation;
/**
 * Создание класса для тестирования
 */
public class Testik {
	/**
	 * Создание тестовых методов
	 */
	@Test
	/**
	 * Начало теста расчета стоимости заказа
	 */
	public void test1() {
		/**
		 * Тест для проверки расчета стоимости заказа 
		 * при следующих параметрах:
		 * Цена "Эспрессо" = 35 руб. (переменная price)
		 * Количество сахара - 1 (переменная sugar)
		 * Цена сахара - 3 руб (переменная sugar_price)
		 */
		int price = 35,  sugar = 1, sugar_price = 3;
		/**
		 * Переменная s отвечает за значение из функции calc_s, которая расположена
		 * в классе Calculation
		 */
		int s;
		/**
		 * Вызывается функция calc_s, в нее подаются значения для расчета
		 * стоимости заказа, а её результат записывается в переменную s
		 */
		s = Calculation.calc_s(price,sugar, sugar_price);
		/**
		 * Создается переменная tests, в которую записывается ожидаемый результат 
		 */
		int tests = 38;
		/**
		 * Сверяется результат работы фунциии calc_s (переменная s) и
		 * ожидаемый результат (переменная tests)
		 */
		assertEquals(tests,s);	
	}
	
	@Test
	/**
	 * Начало теста расчета стоимости заказа
	 */
	public void test2() {
		/**
		 * Тест для проверки расчета стоимости заказа 
		 * при следующих параметрах:
		 * Цена "Капучино" = 40 руб. (переменная price)
		 * Количество сахара - 3 (переменная sugar)
		 * Цена сахара - 3 руб (переменная sugar_price)
		 */
		int price = 40,  sugar = 3, sugar_price = 3;
		/**
		 * Переменная s отвечает за значение из функции calc_s, которая расположена
		 * в классе Calculation
		 */
		int s;
		/**
		 * Вызывается функция calc_s, в нее подаются значения для расчета
		 * стоимости заказа, а её результат записывается в переменную s
		 */
		s = Calculation.calc_s(price,sugar, sugar_price);
		/**
		 * Создается переменная tests, в которую записывается ожидаемый результат 
		 */
		int tests = 49;
		/**
		 * Сверяется результат работы фунциии calc_s (переменная s) и
		 * ожидаемый результат (переменная tests)
		 */
		assertEquals(tests,s);	
	}
	
	@Test
	/**
	 * Начало теста расчета стоимости заказа
	 */
	public void test3() {
		/**
		 * Тест для проверки расчета стоимости заказа 
		 * при следующих параметрах:
		 * Цена "Американо" = 30 руб. (переменная price)
		 * Количество сахара - 0 (переменная sugar)
		 * Цена сахара - 3 руб (переменная sugar_price)
		 */
		int price = 30,  sugar = 0, sugar_price = 3;
		/**
		 * Переменная s отвечает за значение из функции calc_s, которая расположена
		 * в классе Calculation
		 */
		int s;
		/**
		 * Вызывается функция calc_s, в нее подаются значения для расчета
		 * стоимости заказа, а её результат записывается в переменную s
		 */
		s = Calculation.calc_s(price,sugar, sugar_price);
		/**
		 * Создается переменная tests, в которую записывается ожидаемый результат 
		 */
		int tests = 30;
		/**
		 * Сверяется результат работы фунциии calc_s (переменная s) и
		 * ожидаемый результат (переменная tests)
		 */
		assertEquals(tests,s);	
	}
	
	@Test
	/**
	 * Начало теста расчета стоимости заказа
	 */
	public void test4() {
		/**
		 * Тест для проверки расчета стоимости заказа 
		 * при следующих параметрах:
		 * Цена "Латте" = 45 руб. (переменная price)
		 * Количество сахара - 2 (переменная sugar)
		 * Цена сахара - 3 руб (переменная sugar_price)
		 */
		int price = 45,  sugar = 2, sugar_price = 3;
		/**
		 * Переменная s отвечает за значение из функции calc_s, которая расположена
		 * в классе Calculation
		 */
		int s;
		/**
		 * Вызывается функция calc_s, в нее подаются значения для расчета
		 * стоимости заказа, а её результат записывается в переменную s
		 */
		s = Calculation.calc_s(price,sugar, sugar_price);
		/**
		 * Создается переменная tests, в которую записывается ожидаемый результат 
		 */
		int tests = 51;
		/**
		 * Сверяется результат работы фунциии calc_s (переменная s) и
		 * ожидаемый результат (переменная tests)
		 */
		assertEquals(tests,s);	
	}
	
	@Test
	/**
	 * Начало теста расчета стоимости заказа
	 */
	public void test5() {
		/**
		 * Тест для подсчета внесенного платежа 
		 * при следующих параметрах:
		 * Кол-во купюр номиналом 10 руб. = 1 (переменная ten)
		 * Кол-во купюр номиналом 50 руб. = 0 (переменная fifty)
		 * Кол-во купюр номиналом 100 руб. = 3 (переменная hundred)
		 */
		int ten = 1,  fifty = 0, hundred = 3;
		/**
		 * Переменная s отвечает за значение из функции calc_n, которая расположена
		 * в классе Calculation
		 */
		int s;
		/**
		 * Вызывается функция calc_n, в нее подаются значения для расчета
		 * введенного платежа, а её результат записывается в переменную s
		 */
		s = Calculation.calc_n(ten,fifty, hundred);
		/**
		 * Создается переменная tests, в которую записывается ожидаемый результат 
		 */
		int tests = 310;
		/**
		 * Сверяется результат работы фунциии calc_n (переменная s) и
		 * ожидаемый результат (переменная tests)
		 */
		assertEquals(tests,s);	
	}
	
	@Test
	/**
	 * Начало теста расчета стоимости заказа
	 */
	public void test6() {
		/**
		 * Тест для подсчета внесенного платежа 
		 * при следующих параметрах:
		 * Кол-во купюр номиналом 10 руб. = 5 (переменная ten)
		 * Кол-во купюр номиналом 50 руб. = 1 (переменная fifty)
		 * Кол-во купюр номиналом 100 руб. = 1 (переменная hundred)
		 */
		int ten = 5,  fifty = 1, hundred = 1;
		/**
		 * Переменная s отвечает за значение из функции calc_n, которая расположена
		 * в классе Calculation
		 */
		int s;
		/**
		 * Вызывается функция calc_n, в нее подаются значения для расчета
		 * введенного платежа, а её результат записывается в переменную s
		 */
		s = Calculation.calc_n(ten,fifty, hundred);
		/**
		 * Создается переменная tests, в которую записывается ожидаемый результат 
		 */
		int tests = 200;
		/**
		 * Сверяется результат работы фунциии calc_n (переменная s) и
		 * ожидаемый результат (переменная tests)
		 */
		assertEquals(tests,s);	
	}
	
	@Test
	/**
	 * Начало теста расчета стоимости заказа
	 */
	public void test7() {
		/**
		 * Тест для подсчета внесенного платежа 
		 * при следующих параметрах:
		 * Кол-во купюр номиналом 10 руб. = 0 (переменная ten)
		 * Кол-во купюр номиналом 50 руб. = 0 (переменная fifty)
		 * Кол-во купюр номиналом 100 руб. = 1 (переменная hundred)
		 */
		int ten = 0,  fifty = 0, hundred = 1;
		/**
		 * Переменная s отвечает за значение из функции calc_n, которая расположена
		 * в классе Calculation
		 */
		int s;
		/**
		 * Вызывается функция calc_n, в нее подаются значения для расчета
		 * введенного платежа, а её результат записывается в переменную s
		 */
		s = Calculation.calc_n(ten,fifty, hundred);
		/**
		 * Создается переменная tests, в которую записывается ожидаемый результат 
		 */
		int tests = 100;
		/**
		 * Сверяется результат работы фунциии calc_n (переменная s) и
		 * ожидаемый результат (переменная tests)
		 */
		assertEquals(tests,s);	
	}
	
	@Test
	/**
	 * Начало теста расчета стоимости заказа
	 */
	public void test8() {
		/**
		 * Тест для подсчета внесенного платежа 
		 * при следующих параметрах:
		 * Кол-во купюр номиналом 10 руб. = 7 (переменная ten)
		 * Кол-во купюр номиналом 50 руб. = 2 (переменная fifty)
		 * Кол-во купюр номиналом 100 руб. = 0 (переменная hundred)
		 */
		int ten = 7,  fifty = 2, hundred = 0;
		/**
		 * Переменная s отвечает за значение из функции calc_n, которая расположена
		 * в классе Calculation
		 */
		int s;
		/**
		 * Вызывается функция calc_n, в нее подаются значения для расчета
		 * введенного платежа, а её результат записывается в переменную s
		 */
		s = Calculation.calc_n(ten,fifty, hundred);
		/**
		 * Создается переменная tests, в которую записывается ожидаемый результат 
		 */
		int tests = 170;
		/**
		 * Сверяется результат работы фунциии calc_n (переменная s) и
		 * ожидаемый результат (переменная tests)
		 */
		assertEquals(tests,s);	
	}
}