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
	/**
	 * объявляем статичную общедоступную целочисленную функцию для вычисления
	 * внесенной платы
	 */
		public static int calc_n(int ten, int fifty, int hundred){
			/**
			 * обнуляем переменную summa
			 */
			int summa = 0;
				/**
				 * вычисляем по формуле
				 */
				summa = (int) (ten * 10 + fifty * 50 + hundred * 100);
			/**
			* возвращаем переменную summa
			*/	
			return summa;
		}
}
