/*商城库存清单程序设计
 *
 * 编写一个模拟商城库存清单的程序，打印出库存中每种商品的详细信息以及所有商品的汇总。
 * 
 * 商品的详细信息包括：品牌型号、尺寸、价格、配置和库存数。
 * 商品汇总信息应包含总库存数和库存商品总金额。
 * 
 * 	商品信息表：
 * 	品牌型号			尺寸		价格			配置						库存数
 *	MacbookAir		13.3	6988.88		i5处理器4GB内存128G固态硬盘	5
 *	ThinkpadT450	14.0	5999.99		i5处理器4GB内存500G硬盘		10
 *	ASUS-FL5800		15.6	4999.5		i7处理器4GB内存128G固态硬盘	10
 */
package practice.java;

public class Practice_1 {
	public static void main(String[] args) {

		//开始设置各个商品的信息，并赋值。

		// Brand:电脑		Size:尺寸		Price：价格	Conf：配置	Inventory：库存数
		final String NAME = "品牌型号";
		final String SIZE = "尺寸";
		final String PRICE = "价格";
		final String CONF = "配置";
		final String INVENTORY = "库存";

		// 定义MacbookAir信息
		String macBrand = "MacbookAir";
		float macSize = 13.3f;
		double macPrice = 6988.88;
		String macConf = "i5处理器4GB内存128G固态硬盘";
		int macInventory = 5;

		// 定义ThinkpadT450信息
		String thinkBrand = "ThinkpadT450";
		float thinkSize = 14.0f;
		double thinkPrice = 5999.99;
		String thinkConf = "i5处理器4GB内存500G硬盘";
		int thinkInventory = 10;

		// 定义ASUS-FL5800信息
		String asusBrand = "ASUS-FL5800";
		float asusSize = 15.6f;
		double asusPrice = 4999.5;
		String asusConf = "i7处理器4GB内存128G固态硬盘";
		int asusInventory = 18;

		//开始输出
		System.out.println("--------------------商店库存清单--------------------");
		System.out.println(NAME + "\t\t" + SIZE + "\t" + PRICE + "\t" + CONF + "\t\t\t" + INVENTORY);
		System.out.println(macBrand + "\t" + macSize + "\t" + macPrice + "\t" + macConf + "\t" + macInventory);
		System.out
				.println(thinkBrand + "\t" + thinkSize + "\t" + thinkPrice + "\t" + thinkConf + "\t" + thinkInventory);
		System.out.println(asusBrand + "\t" + asusSize + "\t" + asusPrice + "\t" + asusConf + "\t" + asusInventory);
		System.out.println("----------------------------------------------------");

		//定义库存总数（sumInventory）和库存总金额（sumPrice）
		int sumInventory = macInventory + thinkInventory + asusInventory;
		double sumPrice = macPrice * macInventory + thinkPrice * thinkInventory + asusPrice * asusInventory;

		// 输出库存总数和库存总金额
		System.out.println("库存总数是：" + sumInventory);
		System.out.println("库存总金额是：" + sumPrice);
	}
}