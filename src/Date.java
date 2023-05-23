public class Date {

	private int day;
	private int month;
	private int year;

	// 1
	public Date() {
	};

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	};

	public Date(Date dt) {
		this(dt.day, dt.month, dt.year);
	}

	// 2

	public static boolean verif(Date dt) {

		if (dt.day < 0 || dt.day > 31 || dt.month < 0 || dt.month > 12
				|| dt.year < 1900 || dt.year > 2018)
			return false;

		return true;

	}

	public static int comp(Date dt1, Date dt2) {

		if (dt1.year < dt2.year)
			return 1;

		else if (dt1.year > dt2.year)
			return 2;

		else if (dt1.month < dt2.month)
			return 1;
		else if (dt1.month > dt2.month)
			return 2;
		else if (dt1.day < dt2.day)
			return 1;
		else if (dt1.day > dt2.day)
			return 2;

		else
			return 0;

	};

	public static int comp2(Date dt1, Date dt2) {

		if (dt1.year == dt2.year)
			return 1;

		return 0;
	}

	@Override
	public String toString() {
		return "" + this.day + "\\" + this.month + "\\" + this.year;

	};

}
