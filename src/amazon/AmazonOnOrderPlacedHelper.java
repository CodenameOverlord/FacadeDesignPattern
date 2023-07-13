package src.amazon;

public class AmazonOnOrderPlacedHelper {
    InvoiceGenerator invoiceGenerator;
    EmailNotificationService emailNotificationService;
    ApplicationNotificationService applicationNotificationService;
    InventoryManagementService inventoryManagementService;
    public void onOrderPlace() {
        invoiceGenerator.generateInvoice();
        emailNotificationService.sendEmail();
        applicationNotificationService.sendNotification();
        inventoryManagementService.updateInventory();
    }
}
