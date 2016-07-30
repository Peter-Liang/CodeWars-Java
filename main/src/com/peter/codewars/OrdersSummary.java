package com.peter.codewars;

import java.security.InvalidParameterException;
import java.util.ArrayList;


/**
 * 6kyu: Ease the StockBroker
 * https://www.codewars.com/kata/ease-the-stockbroker/train/java
 */
public class OrdersSummary {
    public static String balanceStatements(String lst) {
        String[] orders = lst.trim().split(",");
        for (int i = 0; i < orders.length; i++) {
            orders[i] = orders[i].trim();
        }
        ArrayList<String> badlyOrders = new ArrayList<>();
        double buy = 0, sell = 0;
        for (String order : orders) {
            try {
                Double orderResult = getOrderResult(order);
                if (orderResult >= 0) {
                    buy += orderResult;
                } else {
                    sell += orderResult;
                }
            } catch (Exception e) {
                badlyOrders.add(order);
            }
        }

        String result = "Buy: " + Math.round(buy) + " Sell: " + Math.round(Math.abs(sell));
        if (!badlyOrders.isEmpty()) {
            result += "; Badly formed " + badlyOrders.size() + ": ";
            for (String badlyOrder : badlyOrders) {
                result += badlyOrder + " ;";
            }
        }
        return result;
    }

    private static Double getOrderResult(String order) {
        if (order.isEmpty()) {
            return 0d;
        }

        String[] columns = order.split(" ");
        if (columns.length != 4) {
            throw new InvalidParameterException();
        }

        int quantity = Integer.parseInt(columns[1]);

        if (!columns[2].contains(".")) {
            throw new InvalidParameterException();
        }
        double price = Double.parseDouble(columns[2]);

        String status = columns[3];
        if (status.equalsIgnoreCase("B") && status.equalsIgnoreCase("S")) {
            throw new InvalidParameterException();
        }

        double result = quantity * price;
        if (status.equalsIgnoreCase("S")) {
            result *= -1;
        }
        return result;
    }
}
