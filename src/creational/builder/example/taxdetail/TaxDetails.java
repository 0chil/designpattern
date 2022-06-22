package creational.builder.example.taxdetail;

import java.util.Collections;
import java.util.Map;

public class TaxDetails {
	// A first class collection
	private final Map<String, Double> items;

	public TaxDetails(Map<String, Double> items) {
		this.items = items;
	}

	Map<String, Double> getItems() {
		// accessible up to subclass in same package, unmodifiable.
		return Collections.unmodifiableMap(items);
	}

	public double getTotal() {
		return items.values().stream().mapToDouble(Double::doubleValue).sum();
	}

	public void exemptItems(TaxDetails exemptDetails) {
		exemptDetails.getItems().forEach(this::exempt);
	}

	private void exempt(String exemptItem, Double exemptAmount) {
		if (items.get(exemptItem) != null) {
			Double beforeAmount = items.get(exemptItem);
			items.put(exemptItem, beforeAmount - exemptAmount);
		}
	}
}
