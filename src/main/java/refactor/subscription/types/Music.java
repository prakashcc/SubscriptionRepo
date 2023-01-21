package refactor.subscription.types;

import refactor.subscription.Subscription;

public class Music implements Subscription {


    @Override
    public String billingCycle(String billingCycle) {
        Integer cost = 0;

        if("Monthly".equals(billingCycle)) {
            cost = 20;
        } else if("Quarterly".equals(billingCycle)) {
            cost = 50;
        } else if ("Annual".equals(billingCycle)) {
            cost = 150;
        }
        getTotalCostforTwelveMonths(billingCycle,cost);
        return String.valueOf(cost);
    }

    @Override
    public void initiateSubscription(Integer cost, String billingCycle) {
        System.out.println("Your " + billingCycle + " Music subscription created. Cost per cycle is " + cost);
    }

    public int getTotalCostforTwelveMonths(String billingCycle, Integer cost) {

        int total = 0;
        if("Monthly".equals(billingCycle)) {
            total = cost *12;
        } else if("Quarterly".equals(billingCycle)) {
            total = cost *4;
        } else if ("Annual".equals(billingCycle)) {
            total = cost *1;
        }
        System.out.println("Total cost for next 12 months will be " + total);

        return total;
    }
}
