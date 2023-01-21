package refactor;


import refactor.subscription.Subscription;
import refactor.subscription.factory.SubscriptionFactory;

public class SubscriptionProcessor {

	static int cost = 0;
	
	public static void main(String[] args) {

		String subscriptionType = args[0]; // Possible value is Video, Music or Podcast
		String billingCycle = args[1]; // Possible value is Monthly, Quarterly or Annual
		SubscriptionProcessor process = new SubscriptionProcessor();
		process.createSubscriptionAndCalculateCost(subscriptionType, billingCycle);			
	}
	
	public int createSubscriptionAndCalculateCost(String subscriptionType, String billingCycle) {
		SubscriptionFactory subscriptionFactory = new SubscriptionFactory();
		Subscription subscription = subscriptionFactory.getinstance(subscriptionType);
		Integer cost = Integer.valueOf(subscription.billingCycle(billingCycle));
		return subscription.getTotalCostforTwelveMonths(billingCycle,cost);
	}
	
	private static void initiateSubscription(String subscriptionType, String billingCycle) {

		SubscriptionFactory subscriptionFactory = new SubscriptionFactory();
		Subscription subscription = subscriptionFactory.getinstance(subscriptionType);
		Integer cost = Integer.valueOf(subscription.billingCycle(billingCycle));
		subscription.initiateSubscription(cost,billingCycle);

	}


	

	
	
}
