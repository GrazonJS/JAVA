

enum Event_type{
        Movie,
        Sports,
        Concert;
    }

public class Event{
   private String event_name;
   private String event_date;
   private String event_time;
   private String venue_name;
   private int total_seats;
   private int available_seats;
   private double ticket_price;
    Event_type event_type;

    Event(){}

    Event(String event_name, String event_date, String event_time, String venue_name, int total_seats, int available_seats, Event_type event_type){
        this.event_name = event_name;
        this.event_date = event_date;
        this.event_time = event_time;
        this.venue_name = venue_name;
        this.total_seats = total_seats;
        this.available_seats = available_seats;
        this.event_type = event_type;
    }
    
}