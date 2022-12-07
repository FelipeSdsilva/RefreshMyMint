package views;

public class StringText {

	public String mensage = """
			Products;
			%s, which price is $ %.2f
			%s, which price is $ %.2f

			Record: %d years old. code %d and gender: %c

			Measue whit eight decimal places: %.8f
			Rouded (three decimal places): %.3f
			""";
	public String rectangle = """
			Enter rectangle width and height: 
			""";
	public String percentageIncrease ="""
			Which percentage to increase salary?  """;
	public String[] statics = {"""
			What is the dollar price? ""","""
			How many dollar will be bought? ""","""
			Amount to be paid in reais = """};
	public String[] account = {"Enter account number: ",
			"Enter account holder: ",
			"Is there na initial deposit (y/n)? ",
			"Enter initial deposit value:  ",
			"Account data:",
			"Enter deposit value:",
			"Update account:",
			"Enter a withdraw value: "};
	public String[] product = { """
			Enter the product data:
			""","""
			Product data: """,
			"""
			Update data: ""","""
			Enter the number of product to be added in stock: 
			""","""
			Enter the number of product to be remove in stock: 
			"""};

	
}
