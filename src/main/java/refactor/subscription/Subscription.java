package refactor.subscription;

public interface Subscription {

   public String billingCycle(String cycle);

   public void initiateSubscription(Integer cost, String billingCycle);

   public int getTotalCostforTwelveMonths(String billingCycle,Integer cost);

}
