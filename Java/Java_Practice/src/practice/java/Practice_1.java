/*�̳ǿ���嵥�������
 *
 * ��дһ��ģ���̳ǿ���嵥�ĳ��򣬴�ӡ�������ÿ����Ʒ����ϸ��Ϣ�Լ�������Ʒ�Ļ��ܡ�
 * 
 * ��Ʒ����ϸ��Ϣ������Ʒ���ͺš��ߴ硢�۸����úͿ������
 * ��Ʒ������ϢӦ�����ܿ�����Ϳ����Ʒ�ܽ�
 * 
 * 	��Ʒ��Ϣ��
 * 	Ʒ���ͺ�			�ߴ�		�۸�			����						�����
 *	MacbookAir		13.3	6988.88		i5������4GB�ڴ�128G��̬Ӳ��	5
 *	ThinkpadT450	14.0	5999.99		i5������4GB�ڴ�500GӲ��		10
 *	ASUS-FL5800		15.6	4999.5		i7������4GB�ڴ�128G��̬Ӳ��	18
 */
package practice.java;

public class Practice_1 {
	public static void main(String[] args) {

		// ��ʼ���ø�����Ʒ����Ϣ������ֵ��

		// Brand:���� Size:�ߴ� Price���۸� Conf������ Inventory�������
		final String NAME = "����";
		final String SIZE = "�ߴ�";
		final String PRICE = "�۸�";
		final String CONF = "����";
		final String INVENTORY = "�����";

		// ����MacbookAir
		String macBrand = "MacbookAir";
		float macSize = 13.3f;
		double macPrice = 6988.88;
		String macConf = "i5������4GB�ڴ�128G��̬Ӳ��";
		int macInventory = 5;

		// ����ThinkpadT450
		String thinkBrand = "ThinkpadT450";
		float thinkSize = 14.0f;
		double thinkPrice = 5999.99;
		String thinkConf = "i5������4GB�ڴ�500GӲ��";
		int thinkInventory = 10;

		// ����ASUS-FL5800
		String asusBrand = "ASUS-FL5800";
		float asusSize = 15.6f;
		double asusPrice = 4999.5;
		String asusConf = "i7������4GB�ڴ�128G��̬Ӳ��";
		int asusInventory = 18;

		// ��ʼ���
		System.out.println("--------------------��Ʒ����嵥--------------------");
		System.out.println(NAME + "\t\t" + SIZE + "\t" + PRICE + "\t" + CONF + "\t\t\t" + INVENTORY);
		System.out.println(macBrand + "\t" + macSize + "\t" + macPrice + "\t" + macConf + "\t" + macInventory);
		System.out
				.println(thinkBrand + "\t" + thinkSize + "\t" + thinkPrice + "\t" + thinkConf + "\t" + thinkInventory);
		System.out.println(asusBrand + "\t" + asusSize + "\t" + asusPrice + "\t" + asusConf + "\t" + asusInventory);
		System.out.println("----------------------------------------------------");

		// �����ܿ������sumInventory���Ϳ���ܼۣ�sumPrice��
		int sumInventory = macInventory + thinkInventory + asusInventory;
		double sumPrice = macPrice * macInventory + thinkPrice * thinkInventory + asusPrice * asusInventory;

		// ����ܿ�����Ϳ���ܼ�
		System.out.println("��������ǣ�" + sumInventory);
		System.out.println("����ܼ��ǣ�" + sumPrice);
	}
}