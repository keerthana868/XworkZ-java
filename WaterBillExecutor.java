class WaterBillExecutor{
	public static void main(String[] paid){
		WaterBill bill = new WaterBill();
		bill.billId = 1;
		bill.billAmount = 599.99;
		bill.isFinalBill = true;
		bill.isLatestBill = true;
		bill.billIssueDate = "02-03-2026";
		bill.billDueDate = "03-04-2026";
		bill.isBillOverDue = false;
		bill.billInvoiceNo = "A123";
		System.out.println("The bill Id"+ bill.billId);
		System.out.println("The bill Invoice is "+ bill.billInvoiceNo);
	}
}

