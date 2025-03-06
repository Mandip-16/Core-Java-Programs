package java17.SwitchPattern;

public class HelpCentre {
    public static void main(String[] args) {
        Object issue = new BillingIssue("Payment not processed");

        handleIssue(issue);
    }

    public static void handleIssue(Object issue) {
        switch (issue) {
            case BillingIssue b ->
                    System.out.println("Handling Billing Issue: " + b.getDetails());

            case TechnicalIssue t ->
                    System.out.println("Handling Technical Issue: " + t.getDetails());

            case GeneralIssue g ->
                    System.out.println("Handling General Inquiry: " + g.getDetails());

            default ->
                    System.out.println("Unknown issue type");
        }
    }
}

class BillingIssue {
    private final String details;

    public BillingIssue(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }
}

class TechnicalIssue {
    private final String details;

    public TechnicalIssue(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }
}

class GeneralIssue {
    private final String details;

    public GeneralIssue(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }
}

