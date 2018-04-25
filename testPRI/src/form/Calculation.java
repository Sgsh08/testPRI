/**
 * Указываем, что класс принадлежит пакету form
 */
package form;
/**
 * Создаем класс
 */
public class Calculation {
	/**
	 * объявляем статичную общедоступную целочисленную функцию для вычисления
	 * стоимости заказа
	 */
	public static int calc_s(int price, int sugar, int sugar_price){
		/**
		 * обнуляем переменную summ
		 */
		int summ = 0;
			/**
			 * вычисляем по формуле
			 */
			summ = (int) (price + sugar * sugar_price);
		/**
		* возвращаем переменную summ
		*/	
		return summ;
	}
}
