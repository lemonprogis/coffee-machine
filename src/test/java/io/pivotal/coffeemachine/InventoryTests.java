package io.pivotal.coffeemachine;

import java.util.Map;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;

/**
 * Abstract base class for for {@link Inventory} tests.
 */
public abstract class InventoryTests {

	private Inventory inventory;

	public InventoryTests(Inventory inventory) {
		this.inventory = inventory;
	}

	@Test
	public void getIngredientsShouldReturnTheIngredientsInInventory() {
		Map<String, Integer> ingredients = this.inventory.getIngredients();
		assertThat(ingredients).contains(entry("coffee", 10));
		assertThat(ingredients).contains(entry("sugar", 10));
		assertThat(ingredients).contains(entry("cream", 10));
	}

	@Test
	public void deductShouldReduceQuantity() {
		this.inventory.deduct("coffee", 2);
		Map<String, Integer> ingredients = this.inventory.getIngredients();
		assertThat(ingredients).contains(entry("coffee", 8));
	}

}
