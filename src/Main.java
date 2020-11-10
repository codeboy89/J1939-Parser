public class Main {

	public static void main(String[] args) {

		parseID(0x0CF00203);
		parseID(0x0CF00300);
		parseID(0x0CF00400);
		parseID(0x18E82B00);
		parseID(0x18EA002B);
		parseID(0x18EAFF2B);
		parseID(0x18EBFF00);
		parseID(0x18EF033B);
		parseID(0x18EF3B03);
		parseID(0x18EF5959);
		parseID(0x18F00503);
		parseID(0x18FE8C00);
		parseID(0x18FECA00);
		parseID(0x18FEDB00);
		parseID(0x18FEDF00);
		parseID(0x18FEE400);
		parseID(0x18FEE500);
		parseID(0x18FEEE00);
		parseID(0x18FEEF00);
		parseID(0x18FEF000);
		parseID(0x18FEF200);
		parseID(0x18FEF500);
		parseID(0x18FEF600);
		parseID(0x18FEF700);

		parseID(0x18FEF803);
		System.out.println(500 % 250);
		System.out.println(500 % 750);
		System.out.println(500 % 10);

	}

	public static void parseID(int id) {
		System.out.print("ID: " + id);
		System.out.print("	Source Address: " + ((id & 0x000000ff)));
		System.out.print("	Priority: " + ((id & 0x1c000000) >> 26));
		System.out.print("	PGN: " + ((id & 0x03ffff00) >> 8));
		System.out.println("");
		/*
		 * long idNew = 0; System.out.println("IDN: " + idNew); idNew = idNew | 3; System.out.println("IDN: " + idNew); idNew = idNew | (0xFEF8 << 8); System.out.println("IDN: " + idNew); idNew = idNew | (6 << 26); System.out.println("IDN: " +
		 * idNew);
		 */

	}
}
