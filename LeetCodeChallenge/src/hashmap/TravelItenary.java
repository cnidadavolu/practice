package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TravelItenary {

    public static void main(String[] args) {
        Map<String, String> ticketsMap = new HashMap<String, String>();
        ticketsMap.put("Chennai", "Delhi");
        ticketsMap.put("Bombay", "kashmir");
        ticketsMap.put("Goa", "Chennai");
        ticketsMap.put("Delhi", "Goa");
        generateItenary(ticketsMap);

        List<List<String>> tickets = new ArrayList<>();
        List<String> tick = new ArrayList<>();
        tick.add("MUC");
        tick.add("LHR");
        List<String> tick1 = new ArrayList<>();
        tick1.add("JFK");
        tick1.add("MUC");
        List<String> tick2 = new ArrayList<>();
        tick2.add("SFO");
        tick2.add("SJC");
        List<String> tick3 = new ArrayList<>();
        tick3.add("LHR");
        tick3.add("SFO");
        tickets.add(tick);
        tickets.add(tick1);
        tickets.add(tick2);
        tickets.add(tick3);
        List<String> itinerary = findItinerary(tickets);
        for (String it : itinerary) {
            System.out.println(it);
        }


    }

//    Input: [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
//    Output: ["JFK", "MUC", "LHR", "SFO", "SJC"]

    public static List<String> findItinerary(List<List<String>> tickets) {
        Map<String, String> ticketsMap = new HashMap<String, String>();
        for (List<String> ticket : tickets) {
            ticketsMap.put(ticket.get(0), ticket.get(1));
        }
        Map<String, String> reverseMap = new HashMap<String, String>();
        String start = null;
        for (Map.Entry<String, String> entry : ticketsMap.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<String, String> entry : ticketsMap.entrySet()) {
            if (!reverseMap.containsKey(entry.getKey())) {
                start = entry.getKey();
                break;
            }
        }

        if (start == null) {
            System.out.println(":: INVALID ITENARY FOUND ::");
            return null;
        }

        String to = ticketsMap.get(start);
        List<String> resultItenary = new ArrayList<>();
        resultItenary.add(start);
        while (to != null) {
            resultItenary.add(to);
            System.out.println(start + "->" + to + ",");
            start = to;
            to = ticketsMap.get(to);
        }
        return resultItenary;
    }


    public static void generateItenary(Map<String, String> ticketsMap) {

        Map<String, String> reverseMap = new HashMap<String, String>();
        String start = null;
        for (Map.Entry<String, String> entry : ticketsMap.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<String, String> entry : ticketsMap.entrySet()) {
            if (!reverseMap.containsKey(entry.getKey())) {
                start = entry.getKey();
                break;
            }
        }

        if (start == null) {
            System.out.println(":: INVALID ITENARY FOUND ::");
            return;
        }

        String to = ticketsMap.get(start);
        while (to != null) {
            System.out.println(start + "->" + to + ",");
            start = to;
            to = ticketsMap.get(to);
        }
    }
}
