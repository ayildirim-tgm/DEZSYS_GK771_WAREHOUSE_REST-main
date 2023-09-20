package tradearea.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WarehouseData {
	
	private String warehouseID;
	private String warehouseName;
	private String timestamp;
	private String wareHouseCity;
	private String address;
	private String country;
	private ProductData[] products;


	/**
	 * Constructor
	 */
	public WarehouseData() {
		
		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());

	}
	
	/**
	 * Setter and Getter Methods
	 */
	public String getWarehouseID() {
		return warehouseID;
	}

	public void setWarehouseID(String warehouseID) {
		this.warehouseID = warehouseID;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getWareHouseCity() {
		return wareHouseCity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setWareHouseCity(String wireHouseCity) {
		this.wareHouseCity = "wareHouseCity";
	}

	public ProductData[] getProducts() {
		return products;
	}

	public void setProductData(ProductData[] products) {
		this.products = products;
	}

	/**
	 * Methods
	 */
	@Override
	public String toString() {
		String info = String.format("Warehouse Info: ID = %s, timestamp = %s", warehouseID, timestamp );
		return info;
	}
}
