package tradearea.warehouse;

import tradearea.model.ProductData;
import tradearea.model.WarehouseData;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class WarehouseSimulation {

	public static WarehouseData generateRandomWarehouseData() {
		WarehouseData warehouseData = new WarehouseData();

		// Set fixed values
		warehouseData.setWarehouseName("Bipa");
		warehouseData.setCountry("Austria");
		warehouseData.setWareHouseCity("Wien");
		warehouseData.setAddress("Rennbahnweg 50");
		warehouseData.setCountry("Österreich");
		// Generate random values
		Random random = new Random();
		warehouseData.setWarehouseID(String.format("%03d", random.nextInt(1000))); // Random 3-digit ID

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		warehouseData.setTimestamp(dateFormat.format(new Date()));

		// You can set warehouseCity and address to random values as well if needed

		// Generate random product data (for demonstration, generate two products)
		ProductData[] productData = new ProductData[4];
		productData[0] = generateRandomProductData();
		productData[1] = generateRandomProductData();
		productData[2] = generateRandomProductData();
		productData[3] = generateRandomProductData();

		warehouseData.setProductData(productData);

		return warehouseData;
	}

	public static ProductData generateRandomProductData() {
		ProductData productData = new ProductData();
		Random random = new Random();

		productData.setProductId(String.format("IN%03d", random.nextInt(1000000))); // Random 3-digit product ID
		productData.setProductName(generateRandomProductName());
		productData.setProductCategory(assignProductCategory(productData.getProductName()));
		productData.setProductAmount(Integer.toString(random.nextInt(100))); // Random product amount

		return productData;
	}

	public static String generateRandomProductName() {
		// You can replace this with a list of actual product names
		String[] productNames = {"Orange", "Zitrone", "Mandarine", "Wassermelone", "Zuckermelone", "Honigmelone"};
		Random random = new Random();
		return productNames[random.nextInt(productNames.length)];
	}

	public static String assignProductCategory(String productName) {
		// Assign the category based on the product name
		if (productName.equals("Orange") || productName.equals("Zitrone") || productName.equals("Mandarine")) {
			return "Zitrusfrucht";
		} else if (productName.equals("Wassermelone") || productName.equals("Zuckermelone") || productName.equals("Honigmelone")) {
			return "Melone";
		} else {
			return "Unknown";
		}
	}
}

