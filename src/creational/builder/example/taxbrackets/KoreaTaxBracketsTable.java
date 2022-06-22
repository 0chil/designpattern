package creational.builder.example.taxbrackets;

import creational.builder.example.taxdetail.TaxDetails;

public class KoreaTaxBracketsTable {

	private static final double[] taxableCriteria = {9226, 37451, 90751, 189301, 411501, 413201};
	private static final double[] taxableBase = {0, 922.5, 5156.25, 18481.25, 46075.25, 119401.25, 119996.25};
	private static final double[] taxablePercentage = {10, 15, 25, 28, 33, 35, 39.6};

	private static int getSection(double income) {
		int section;
		for (section = 0; section < taxableCriteria.length; section++) {
			if (income < taxableCriteria[section])
				return section;
		}
		return section;
	}

	private static double getBaseAmount(int section) {
		if (section > 0)
			return taxableCriteria[section] - 1;
		return 0;
	}

	public static double calculate(TaxDetails taxDetails) {
		double income = taxDetails.getTotal();
		int section = getSection(income);
		return taxableBase[section] + (income - getBaseAmount(section)) / 100.0 * taxablePercentage[section];
	}
}
