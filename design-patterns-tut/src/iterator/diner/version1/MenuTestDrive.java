package iterator.diner.version1;

import iterator.diner.version1.menu.DinerMenu;
import iterator.diner.version1.menu.PancakeHouseMenu;

public class MenuTestDrive {
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

		waitress.printMenu();
	}
}
